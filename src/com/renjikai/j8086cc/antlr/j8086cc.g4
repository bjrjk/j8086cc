grammar j8086cc; 
program		:	(varDeclare | function | arrInit)+ 					;
arrInit		:	IDENTIFIER ASSIGN STRING ';'						;
function	:	basicType IDENTIFIER '(' paramList? ')' block		;
paramList	:	parameter (',' parameter)* 							;
parameter	:	varType IDENTIFIER									;
varDeclare	:	varType IDENTIFIER (',' IDENTIFIER)* ';' 			;
varType		:	basicType ('[' INT ']')*							;
block		:	'{' statement* '}' 									;
leftValue	:	IDENTIFIER ('[' expr ']')*							;
statement	:	block												# subBlock
			|	varDeclare											# varDeclStat
			|	'if' '(' expr ')' statement ('else' statement) ?	# ifSyntax
			|	'while' '(' expr ')' statement						# whileSyntax
			|	'do' statement 'while' '(' expr ')' ';'				# doWhileSyntax
			|	'break' ';'											# breakSyntax
			|	'continue' ';'										# continueSyntax
			|	'return' expr ';'									# returnSyntax
			|	leftValue ASSIGN expr ';'							# lValueAssign
			|	expr? ';'											# exprStat
			;
expr		:	'(' expr ')'										# parenExpr
			|	INT													# intLiteral
			|	IDENTIFIER '(' exprList? ')'						# functionCallExpr
			|	leftValue											# lValueExpr
			|	op=(ADD|SUB|NOT) expr								# unaryExpr
			|	expr op=(MUL|DIV|MOD) expr							# highArithExpr
			|	expr op=(ADD|SUB) expr								# lowArithExpr
			|	expr op=(LT|LE|GE|GT) expr							# relExpr
			|	expr op=(EQ|NE) expr								# eqExpr
			|	expr LAND expr										# logicAndExpr
			|	expr LOR expr										# logicOrExpr
			;
exprList	:	expr (',' expr)* 									;

basicType	:	TYPE_UINT | TYPE_INT | TYPE_CHAR ;
TYPE_UINT	:	'uint' ;
TYPE_INT	:	'int' ;
TYPE_CHAR	:	'char' ;
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
ASSIGN		:	'=' ;
LAND		:	'&&' ;
LOR			:	'||' ;
IDENTIFIER	:	[a-zA-Z_] ([a-zA-Z0-9_])* ;
STRING		:	'"' ( '\\"' | . )*? '"' ;
INT			:	[0-9]+ ;
WS			:	[ \t\n\r]+ -> skip ;
COMMENT		:	'//' .*? '\n' -> skip ;
