grammar j8086cc; 
program		:	(varDeclare | function)+ 							;
function	:	BASICTYPE IDENTIFIER '(' paramList? ')' block		;
paramList	:	parameter (',' parameter)* 							;
parameter	:	varType IDENTIFIER									;
varDeclare	:	varType IDENTIFIER (',' IDENTIFIER)* ';' 			;
varType		:	BASICTYPE ('[' expr ']')*							;
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
			|	leftValue '=' expr ';'								# lValueAssign
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
			|	expr '&&' expr										# logicAndExpr
			|	expr '||' expr										# logicOrExpr
			;
exprList	:	expr (',' expr)* 									;

BASICTYPE	:	TYPE_UINT | TYPE_INT | TYPE_CHAR;
TYPE_UINT	:	'uint' ;
TYPE_INT	:	'int';
TYPE_CHAR	:	'char';
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
