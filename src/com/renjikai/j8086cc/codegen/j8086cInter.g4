grammar j8086cInter; 
program		:	dataSegment codeSegment ;
dataSegment	:	DSEG_HEAD varDecl* ;
varDecl		:	DECL_HEAD varName (STRING)? ;
varName		:	'$' scope=(GLOB_SCOPE|LOC_SCOPE|TMP_SCOPE|PARAM_SCOPE) 
				dataType=(TYPE_UINT|TYPE_INT|TYPE_CHAR) '_'
				INT '_@' IDENTIFIER '$' ;
codeSegment	:	CSEG_HEAD function+ ;
function	:	FUNC_HEAD IDENTIFIER statement* FUNC_TAIL ;
statement	:	'movi' varName ',' SUB? INT						# MOVI
			|	'mov' varName ',' varName						# MOV
			|	'movrm' varName ',' '[' varName ']'				# MOVRM
			|	'movmr' '[' varName ']' ',' varName				# MOVMR
			|	'lea' varName ',' varName						# LEA
			|	'add' varName ',' varName ',' varName			# ADD
			|	'sub' varName ',' varName ',' varName			# SUB
			|	'mul' varName ',' varName ',' varName			# MUL
			|	'div' varName ',' varName ',' varName			# DIV
			|	'mod' varName ',' varName ',' varName			# MOD
			|	'lt' varName ',' varName ',' varName			# LT
			|	'le' varName ',' varName ',' varName			# LE
			|	'ge' varName ',' varName ',' varName			# GE
			|	'gt' varName ',' varName ',' varName			# GT
			|	'eq' varName ',' varName ',' varName			# EQ
			|	'ne' varName ',' varName ',' varName			# NE
			|	'land' varName ',' varName ',' varName			# LAND
			|	'lor' varName ',' varName ',' varName			# LOR
			|	'lnot' varName ',' varName						# LNOT
			|	'jnz' varName ',' LBL							# JNZ
			|	'jz' varName ',' LBL							# JZ
			|	'jmp' LBL										# JMP
			|	'call' IDENTIFIER (',' varName)*				# CALL
			|	'ret' varName									# RET
			|	LBL ':'											# LABEL
			|	varDecl											# LocalVarDecl
			;

TYPE_UINT	:	'_u' ;
TYPE_INT	:	'_i' ;
TYPE_CHAR	:	'_c' ;

GLOB_SCOPE	:	'GLOBALVAR' ;
LOC_SCOPE	:	'LOCALVAR' ;
TMP_SCOPE	:	'TMPVAR' ;
PARAM_SCOPE	:	'PARAMVAR' ;

DSEG_HEAD	:	'.data' ;
CSEG_HEAD	:	'.code' ;

DECL_HEAD	:	'.var' ;
FUNC_HEAD	:	'.fun' ;
FUNC_TAIL	:	'.endfun' ;

LBL			:	'L' INT ;

ADD			:	'+' ;
SUB			:	'-' ;
MUL			:	'*' ;
DIV			:	'/' ;
MOD			:	'%' ;
NOT			:	'!' ;
EQ			:	'==' ;
NE			:	'!=' ;
LT			:	'<' ;
LE			:	'<=' ;
GE			:	'>=' ;
GT			:	'>' ;
IDENTIFIER	:	[a-zA-Z] ([a-zA-Z0-9])* ;
STRING		:	'"' ( '\\"' | . )*? '"' ;
INT			:	[0-9]+ ;
WS			:	[ \t\n\r]+ -> skip ;
COMMENT		:	'//' .*? '\n' -> skip ;
