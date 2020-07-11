grammar j8086cInter; 
program		:	dataSegment codeSegment ;
dataSegment	:	DSEG_HEAD varDecl* ;
varDecl		:	DECL_HEAD varName ;
varName		:	'$' scope=(GLOB_SCOPE|LOC_SCOPE|TMP_SCOPE) 
				dataType=(TYPE_UINT|TYPE_INT|TYPE_CHAR) '_'
				INT '_' IDENTIFIER '$' ;
codeSegment	:	CSEG_HEAD function+ ;
function	:	FUNC_HEAD IDENTIFIER statement FUNC_TAIL ;
statement	:	'mov' varName ',' SUB? INT						# MOVI
			|	'mov' varName ',' varName						# MOV
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
			|	'jnz' varName ',' LBL							# JNZ
			|	'jz' varName ',' LBL							# JZ
			|	'jmp' LBL										# JMP
			|	'call' IDENTIFIER (',' varName)*				# CALL
			|	'ret'											# RET
			|	LBL ':'											# LABEL
			;
TYPE_UINT	:	'u' ;
TYPE_INT	:	'i' ;
TYPE_CHAR	:	'c' ;

GLOB_SCOPE	:	'GLOBALVAR_' ;
LOC_SCOPE	:	'LOCALVAR_' ;
TMP_SCOPE	:	'TMPVAR_' ;

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
IDENTIFIER	:	[a-zA-Z] ([a-zA-Z] | [0-9])* ;
INT			:	[0-9]+ ;
WS			:	[ \t\n\r]+ -> skip ;
COMMENT		:	'//' .*? '\n' -> skip ;
