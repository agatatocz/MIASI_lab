grammar grammar1;

program: 
	(bitOperation {System.out.println("result="+$bitOperation.output);} NL)*
	EOF
	;

bitOperation returns [Integer output]: 
	result1=shift {$output=$result1.output;}
	((
		BIT_OR result2=shift {$output=$output | $result2.output;}
	| 
		BIT_AND result3=shift {$output=$output & $result3.output;}
	|
		BIT_XOR result4=shift {$output=$output ^ $result4.output;}
	))*
;


shift returns [Integer output]: 
	result1=addOrDiff {$output=$result1.output;}
	((
		SHIFT_R result2=addOrDiff {$output=$output >> $result2.output;}
	| 
		SHIFT_L result3=addOrDiff {$output=$output << $result3.output;}
	))*
;

addOrDiff returns [Integer output]: 
	result1=mulOrDiv {$output=$result1.output;}
	 ((
	 	PLUS result2=mulOrDiv {$output+=$result2.output;}
	 | 
	 	MINUS result2=mulOrDiv {$output-=$result2.output;}
	 ))*
;

mulOrDiv returns [Integer output]: 
	result1=atom {$output=$result1.output;}
	((
		MUL result2=atom {$output*=$result2.output;}
	| 
		DIV result3=atom {
			if($result3.output == 0) throw new ArithmeticException();
			else $output/=$result3.output;
		}
	|
		MOD result4=atom {
			if($result4.output == 0) throw new ArithmeticException();
			else $output\%=$result4.output;
		}
	))*
;
catch [ArithmeticException e] {System.out.println("Division by zero is forbidden.");}  

atom returns [Integer output]: 
	INT {$output=Integer.parseInt($INT.text);}
	| 
	LP bitOperation RP {$output=$bitOperation.output;}
	|
	BIT_NOT result=atom {$output=~$result.output;}
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
SHIFT_L: '<<';
SHIFT_R: '>>';