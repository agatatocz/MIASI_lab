grammar grammar1;

program: (expression {System.out.println("result="+$expression.output);} NL)+ EOF;

expression returns [Integer output]: 
	result1=mulOrDiv {$output=$result1.output;}
	 ((PLUS result2=mulOrDiv {$output+=$result2.output;}
	 | 
	 MINUS result2=mulOrDiv {$output-=$result2.output;}))*
	;

mulOrDiv returns [Integer output]: 
	result1=atom {$output=$result1.output;}
	((MUL result2=atom {$output*=$result2.output;}
	| 
	DIV result3=atom {$output/=$result3.output;}))*
	;

atom returns [Integer output]: 
	INT {$output=Integer.parseInt($INT.text);}
	| 
	LP expression RP {$output=$expression.output;}
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;
    
NL:'\n';    
PLUS:	'+';
MINUS:	'-';
MUL:	'*';
DIV:	'/';
LP:	'(';
RP:	')';