// $ANTLR 3.5.1 /home/agata/Pulpit/MIASI/lab_1/grammar1.g 2020-03-04 11:58:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class grammar1Parser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BIT_AND", "BIT_NOT", "BIT_OR", 
		"BIT_XOR", "COMMENT", "DIV", "INT", "LP", "MINUS", "MOD", "MUL", "NL", 
		"PLUS", "RP", "SHIFT_L", "SHIFT_R", "WS"
	};
	public static final int EOF=-1;
	public static final int BIT_AND=4;
	public static final int BIT_NOT=5;
	public static final int BIT_OR=6;
	public static final int BIT_XOR=7;
	public static final int COMMENT=8;
	public static final int DIV=9;
	public static final int INT=10;
	public static final int LP=11;
	public static final int MINUS=12;
	public static final int MOD=13;
	public static final int MUL=14;
	public static final int NL=15;
	public static final int PLUS=16;
	public static final int RP=17;
	public static final int SHIFT_L=18;
	public static final int SHIFT_R=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "program", "atom", "addOrDiff", "mulOrDiv", "bitOperation", 
		"shift"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public grammar1Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public grammar1Parser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public grammar1Parser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return grammar1Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/agata/Pulpit/MIASI/lab_1/grammar1.g"; }



	// $ANTLR start "program"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:3:1: program : ( bitOperation NL )* EOF ;
	public final void program() throws RecognitionException {
		Integer bitOperation1 =null;

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(3, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:3:8: ( ( bitOperation NL )* EOF )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:4:2: ( bitOperation NL )* EOF
			{
			dbg.location(4,2);
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:4:2: ( bitOperation NL )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==BIT_NOT||(LA1_0 >= INT && LA1_0 <= LP)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:4:3: bitOperation NL
					{
					dbg.location(4,3);
					pushFollow(FOLLOW_bitOperation_in_program12);
					bitOperation1=bitOperation();
					state._fsp--;
					dbg.location(4,16);
					System.out.println("result="+bitOperation1);dbg.location(4,70);
					match(input,NL,FOLLOW_NL_in_program16); 
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(5,2);
			match(input,EOF,FOLLOW_EOF_in_program21); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(6, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "bitOperation"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:8:1: bitOperation returns [Integer output] : result1= shift ( ( BIT_OR result2= shift | BIT_AND result3= shift | BIT_XOR result4= shift ) )* ;
	public final Integer bitOperation() throws RecognitionException {
		Integer output = null;


		Integer result1 =null;
		Integer result2 =null;
		Integer result3 =null;
		Integer result4 =null;

		try { dbg.enterRule(getGrammarFileName(), "bitOperation");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:8:38: (result1= shift ( ( BIT_OR result2= shift | BIT_AND result3= shift | BIT_XOR result4= shift ) )* )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:9:2: result1= shift ( ( BIT_OR result2= shift | BIT_AND result3= shift | BIT_XOR result4= shift ) )*
			{
			dbg.location(9,9);
			pushFollow(FOLLOW_shift_in_bitOperation38);
			result1=shift();
			state._fsp--;
			dbg.location(9,16);
			output =result1;dbg.location(10,2);
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:10:2: ( ( BIT_OR result2= shift | BIT_AND result3= shift | BIT_XOR result4= shift ) )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==BIT_AND||(LA3_0 >= BIT_OR && LA3_0 <= BIT_XOR)) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:10:3: ( BIT_OR result2= shift | BIT_AND result3= shift | BIT_XOR result4= shift )
					{
					dbg.location(10,3);
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:10:3: ( BIT_OR result2= shift | BIT_AND result3= shift | BIT_XOR result4= shift )
					int alt2=3;
					try { dbg.enterSubRule(2);
					try { dbg.enterDecision(2, decisionCanBacktrack[2]);

					switch ( input.LA(1) ) {
					case BIT_OR:
						{
						alt2=1;
						}
						break;
					case BIT_AND:
						{
						alt2=2;
						}
						break;
					case BIT_XOR:
						{
						alt2=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(2);}

					switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:11:3: BIT_OR result2= shift
							{
							dbg.location(11,3);
							match(input,BIT_OR,FOLLOW_BIT_OR_in_bitOperation48); dbg.location(11,17);
							pushFollow(FOLLOW_shift_in_bitOperation52);
							result2=shift();
							state._fsp--;
							dbg.location(11,24);
							output =output | result2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:13:3: BIT_AND result3= shift
							{
							dbg.location(13,3);
							match(input,BIT_AND,FOLLOW_BIT_AND_in_bitOperation62); dbg.location(13,18);
							pushFollow(FOLLOW_shift_in_bitOperation66);
							result3=shift();
							state._fsp--;
							dbg.location(13,25);
							output =output & result3;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:15:3: BIT_XOR result4= shift
							{
							dbg.location(15,3);
							match(input,BIT_XOR,FOLLOW_BIT_XOR_in_bitOperation75); dbg.location(15,18);
							pushFollow(FOLLOW_shift_in_bitOperation79);
							result4=shift();
							state._fsp--;
							dbg.location(15,25);
							output =output ^ result4;
							}
							break;

					}
					} finally {dbg.exitSubRule(2);}

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bitOperation");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return output;
	}
	// $ANTLR end "bitOperation"



	// $ANTLR start "shift"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:20:1: shift returns [Integer output] : result1= addOrDiff ( ( SHIFT_R result2= addOrDiff | SHIFT_L result3= addOrDiff ) )* ;
	public final Integer shift() throws RecognitionException {
		Integer output = null;


		Integer result1 =null;
		Integer result2 =null;
		Integer result3 =null;

		try { dbg.enterRule(getGrammarFileName(), "shift");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:20:31: (result1= addOrDiff ( ( SHIFT_R result2= addOrDiff | SHIFT_L result3= addOrDiff ) )* )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:21:2: result1= addOrDiff ( ( SHIFT_R result2= addOrDiff | SHIFT_L result3= addOrDiff ) )*
			{
			dbg.location(21,9);
			pushFollow(FOLLOW_addOrDiff_in_shift103);
			result1=addOrDiff();
			state._fsp--;
			dbg.location(21,20);
			output =result1;dbg.location(22,2);
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:22:2: ( ( SHIFT_R result2= addOrDiff | SHIFT_L result3= addOrDiff ) )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= SHIFT_L && LA5_0 <= SHIFT_R)) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:22:3: ( SHIFT_R result2= addOrDiff | SHIFT_L result3= addOrDiff )
					{
					dbg.location(22,3);
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:22:3: ( SHIFT_R result2= addOrDiff | SHIFT_L result3= addOrDiff )
					int alt4=2;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					int LA4_0 = input.LA(1);
					if ( (LA4_0==SHIFT_R) ) {
						alt4=1;
					}
					else if ( (LA4_0==SHIFT_L) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:23:3: SHIFT_R result2= addOrDiff
							{
							dbg.location(23,3);
							match(input,SHIFT_R,FOLLOW_SHIFT_R_in_shift113); dbg.location(23,18);
							pushFollow(FOLLOW_addOrDiff_in_shift117);
							result2=addOrDiff();
							state._fsp--;
							dbg.location(23,29);
							output =output >> result2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:25:3: SHIFT_L result3= addOrDiff
							{
							dbg.location(25,3);
							match(input,SHIFT_L,FOLLOW_SHIFT_L_in_shift127); dbg.location(25,18);
							pushFollow(FOLLOW_addOrDiff_in_shift131);
							result3=addOrDiff();
							state._fsp--;
							dbg.location(25,29);
							output =output << result3;
							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "shift");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return output;
	}
	// $ANTLR end "shift"



	// $ANTLR start "addOrDiff"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:29:1: addOrDiff returns [Integer output] : result1= mulOrDiv ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )* ;
	public final Integer addOrDiff() throws RecognitionException {
		Integer output = null;


		Integer result1 =null;
		Integer result2 =null;

		try { dbg.enterRule(getGrammarFileName(), "addOrDiff");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:29:35: (result1= mulOrDiv ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )* )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:30:2: result1= mulOrDiv ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )*
			{
			dbg.location(30,9);
			pushFollow(FOLLOW_mulOrDiv_in_addOrDiff154);
			result1=mulOrDiv();
			state._fsp--;
			dbg.location(30,19);
			output =result1;dbg.location(31,3);
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:31:3: ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==MINUS||LA7_0==PLUS) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:31:4: ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv )
					{
					dbg.location(31,4);
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:31:4: ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv )
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==PLUS) ) {
						alt6=1;
					}
					else if ( (LA6_0==MINUS) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:32:4: PLUS result2= mulOrDiv
							{
							dbg.location(32,4);
							match(input,PLUS,FOLLOW_PLUS_in_addOrDiff166); dbg.location(32,16);
							pushFollow(FOLLOW_mulOrDiv_in_addOrDiff170);
							result2=mulOrDiv();
							state._fsp--;
							dbg.location(32,26);
							output+=result2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:34:4: MINUS result2= mulOrDiv
							{
							dbg.location(34,4);
							match(input,MINUS,FOLLOW_MINUS_in_addOrDiff182); dbg.location(34,17);
							pushFollow(FOLLOW_mulOrDiv_in_addOrDiff186);
							result2=mulOrDiv();
							state._fsp--;
							dbg.location(34,27);
							output-=result2;
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}

					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "addOrDiff");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return output;
	}
	// $ANTLR end "addOrDiff"



	// $ANTLR start "mulOrDiv"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:38:1: mulOrDiv returns [Integer output] : result1= atom ( ( MUL result2= atom | DIV result3= atom | MOD result4= atom ) )* ;
	public final Integer mulOrDiv() throws RecognitionException {
		Integer output = null;


		Integer result1 =null;
		Integer result2 =null;
		Integer result3 =null;
		Integer result4 =null;

		try { dbg.enterRule(getGrammarFileName(), "mulOrDiv");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:38:34: (result1= atom ( ( MUL result2= atom | DIV result3= atom | MOD result4= atom ) )* )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:39:2: result1= atom ( ( MUL result2= atom | DIV result3= atom | MOD result4= atom ) )*
			{
			dbg.location(39,9);
			pushFollow(FOLLOW_atom_in_mulOrDiv210);
			result1=atom();
			state._fsp--;
			dbg.location(39,15);
			output =result1;dbg.location(40,2);
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:40:2: ( ( MUL result2= atom | DIV result3= atom | MOD result4= atom ) )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==DIV||(LA9_0 >= MOD && LA9_0 <= MUL)) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:40:3: ( MUL result2= atom | DIV result3= atom | MOD result4= atom )
					{
					dbg.location(40,3);
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:40:3: ( MUL result2= atom | DIV result3= atom | MOD result4= atom )
					int alt8=3;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					switch ( input.LA(1) ) {
					case MUL:
						{
						alt8=1;
						}
						break;
					case DIV:
						{
						alt8=2;
						}
						break;
					case MOD:
						{
						alt8=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:41:3: MUL result2= atom
							{
							dbg.location(41,3);
							match(input,MUL,FOLLOW_MUL_in_mulOrDiv220); dbg.location(41,14);
							pushFollow(FOLLOW_atom_in_mulOrDiv224);
							result2=atom();
							state._fsp--;
							dbg.location(41,20);
							output*=result2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:43:3: DIV result3= atom
							{
							dbg.location(43,3);
							match(input,DIV,FOLLOW_DIV_in_mulOrDiv234); dbg.location(43,14);
							pushFollow(FOLLOW_atom_in_mulOrDiv238);
							result3=atom();
							state._fsp--;
							dbg.location(43,20);

										if(result3 == 0) throw new ArithmeticException();
										else output/=result3;
									
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:48:3: MOD result4= atom
							{
							dbg.location(48,3);
							match(input,MOD,FOLLOW_MOD_in_mulOrDiv247); dbg.location(48,14);
							pushFollow(FOLLOW_atom_in_mulOrDiv251);
							result4=atom();
							state._fsp--;
							dbg.location(48,20);

										if(result4 == 0) throw new ArithmeticException();
										else output%=result4;
									
							}
							break;

					}
					} finally {dbg.exitSubRule(8);}

					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (ArithmeticException e) {
			System.out.println("Division by zero is forbidden.");
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(53, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mulOrDiv");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return output;
	}
	// $ANTLR end "mulOrDiv"



	// $ANTLR start "atom"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:56:1: atom returns [Integer output] : ( INT | LP bitOperation RP | BIT_NOT result= atom );
	public final Integer atom() throws RecognitionException {
		Integer output = null;


		Token INT2=null;
		Integer result =null;
		Integer bitOperation3 =null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:56:30: ( INT | LP bitOperation RP | BIT_NOT result= atom )
			int alt10=3;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt10=1;
				}
				break;
			case LP:
				{
				alt10=2;
				}
				break;
			case BIT_NOT:
				{
				alt10=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:57:2: INT
					{
					dbg.location(57,2);
					INT2=(Token)match(input,INT,FOLLOW_INT_in_atom280); dbg.location(57,6);
					output =Integer.parseInt((INT2!=null?INT2.getText():null));
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:59:2: LP bitOperation RP
					{
					dbg.location(59,2);
					match(input,LP,FOLLOW_LP_in_atom289); dbg.location(59,5);
					pushFollow(FOLLOW_bitOperation_in_atom291);
					bitOperation3=bitOperation();
					state._fsp--;
					dbg.location(59,18);
					match(input,RP,FOLLOW_RP_in_atom293); dbg.location(59,21);
					output =bitOperation3;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:61:2: BIT_NOT result= atom
					{
					dbg.location(61,2);
					match(input,BIT_NOT,FOLLOW_BIT_NOT_in_atom301); dbg.location(61,16);
					pushFollow(FOLLOW_atom_in_atom305);
					result=atom();
					state._fsp--;
					dbg.location(61,22);
					output =~result;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(62, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return output;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_bitOperation_in_program12 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NL_in_program16 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_EOF_in_program21 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shift_in_bitOperation38 = new BitSet(new long[]{0x00000000000000D2L});
	public static final BitSet FOLLOW_BIT_OR_in_bitOperation48 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_shift_in_bitOperation52 = new BitSet(new long[]{0x00000000000000D2L});
	public static final BitSet FOLLOW_BIT_AND_in_bitOperation62 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_shift_in_bitOperation66 = new BitSet(new long[]{0x00000000000000D2L});
	public static final BitSet FOLLOW_BIT_XOR_in_bitOperation75 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_shift_in_bitOperation79 = new BitSet(new long[]{0x00000000000000D2L});
	public static final BitSet FOLLOW_addOrDiff_in_shift103 = new BitSet(new long[]{0x00000000000C0002L});
	public static final BitSet FOLLOW_SHIFT_R_in_shift113 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_addOrDiff_in_shift117 = new BitSet(new long[]{0x00000000000C0002L});
	public static final BitSet FOLLOW_SHIFT_L_in_shift127 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_addOrDiff_in_shift131 = new BitSet(new long[]{0x00000000000C0002L});
	public static final BitSet FOLLOW_mulOrDiv_in_addOrDiff154 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_PLUS_in_addOrDiff166 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_mulOrDiv_in_addOrDiff170 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_MINUS_in_addOrDiff182 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_mulOrDiv_in_addOrDiff186 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_atom_in_mulOrDiv210 = new BitSet(new long[]{0x0000000000006202L});
	public static final BitSet FOLLOW_MUL_in_mulOrDiv220 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_atom_in_mulOrDiv224 = new BitSet(new long[]{0x0000000000006202L});
	public static final BitSet FOLLOW_DIV_in_mulOrDiv234 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_atom_in_mulOrDiv238 = new BitSet(new long[]{0x0000000000006202L});
	public static final BitSet FOLLOW_MOD_in_mulOrDiv247 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_atom_in_mulOrDiv251 = new BitSet(new long[]{0x0000000000006202L});
	public static final BitSet FOLLOW_INT_in_atom280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_atom289 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_bitOperation_in_atom291 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_RP_in_atom293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_NOT_in_atom301 = new BitSet(new long[]{0x0000000000000C20L});
	public static final BitSet FOLLOW_atom_in_atom305 = new BitSet(new long[]{0x0000000000000002L});
}
