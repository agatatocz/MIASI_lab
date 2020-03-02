grammar grammar1;

program: 
	(expression {System.out.println("result="+$expression.output);} NL)*
	EOF
	;

expression returns [Integer output]: 
	result1=mulOrDiv {$output=$result1.output;}
	 ((
	 	PLUS result2=mulOrDiv {$output+=$result2.output;}
	 | 
	 	MINUS result2=mulOrDiv {$output-=$result2.output;}
	 ))*
;

mulOrDiv returns [Integer output]: 
	result1=bitOperations {$output=$result1.output;}
	((
		MUL result2=bitOperations {$output*=$result2.output;}
	| 
		DIV result3=bitOperations {
			if($result3.output == 0) throw new ArithmeticException();
			else $output/=$result3.output;
		}
	|
		MOD result4=bitOperations {$output%=$result4.output;}
	))*
;
catch [ArithmeticException e] {System.out.println("Division by zero is forbidden.");} 

bitOperations returns [Integer output]: 
	result1=atom {$output=$result1.output;}
	((
		BIT_OR result2=atom {$output=$output | $result2.output;}
	| 
		BIT_AND result3=atom {$output=$output & $result3.output;}
	|
		BIT_XOR result4=atom {$output=$output ^ $result4.output;}
	))*
;


atom returns [Integer output]: 
	INT {$output=Integer.parseInt($INT.text);}
	| 
	LP expression RP {$output=$expression.output;}
	|
	BIT_NOT result=atom {$output=~$result.output;}
;


INT :	'0'..'9'+
    ;

BOOL: ('true'|'false');

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;
    
NL:	'\n';    
PLUS:	'+';
MINUS:	'-';
MUL:	'*';
DIV:	'/';
LP:	'(';
RP:	')';
MOD:	'%';
BIT_OR: '|';
BIT_AND: '&';
BIT_XOR: '^';
BIT_NOT: '~';