// $ANTLR 3.5.1 /home/agata/Pulpit/MIASI/lab_1/grammar1.g 2020-03-04 11:15:03

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
		"BIT_XOR", "BOOL", "COMMENT", "DIV", "INT", "LP", "MINUS", "MOD", "MUL", 
		"NL", "PLUS", "RP", "WS"
	};
	public static final int EOF=-1;
	public static final int BIT_AND=4;
	public static final int BIT_NOT=5;
	public static final int BIT_OR=6;
	public static final int BIT_XOR=7;
	public static final int BOOL=8;
	public static final int COMMENT=9;
	public static final int DIV=10;
	public static final int INT=11;
	public static final int LP=12;
	public static final int MINUS=13;
	public static final int MOD=14;
	public static final int MUL=15;
	public static final int NL=16;
	public static final int PLUS=17;
	public static final int RP=18;
	public static final int WS=19;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "mulOrDiv", "program", "expression", "bitOperations", "atom"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false
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
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:3:1: program : ( expression NL )* EOF ;
	public final void program() throws RecognitionException {
		Integer expression1 =null;

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(3, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:3:8: ( ( expression NL )* EOF )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:4:2: ( expression NL )* EOF
			{
			dbg.location(4,2);
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:4:2: ( expression NL )*
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

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:4:3: expression NL
					{
					dbg.location(4,3);
					pushFollow(FOLLOW_expression_in_program12);
					expression1=expression();
					state._fsp--;
					dbg.location(4,14);
					System.out.println("result="+expression1);dbg.location(4,66);
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



	// $ANTLR start "expression"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:8:1: expression returns [Integer output] : result1= mulOrDiv ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )* ;
	public final Integer expression() throws RecognitionException {
		Integer output = null;


		Integer result1 =null;
		Integer result2 =null;

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:8:36: (result1= mulOrDiv ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )* )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:9:2: result1= mulOrDiv ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )*
			{
			dbg.location(9,9);
			pushFollow(FOLLOW_mulOrDiv_in_expression38);
			result1=mulOrDiv();
			state._fsp--;
			dbg.location(9,19);
			output =result1;dbg.location(10,3);
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:10:3: ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==MINUS||LA3_0==PLUS) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:10:4: ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv )
					{
					dbg.location(10,4);
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:10:4: ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv )
					int alt2=2;
					try { dbg.enterSubRule(2);
					try { dbg.enterDecision(2, decisionCanBacktrack[2]);

					int LA2_0 = input.LA(1);
					if ( (LA2_0==PLUS) ) {
						alt2=1;
					}
					else if ( (LA2_0==MINUS) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(2);}

					switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:11:4: PLUS result2= mulOrDiv
							{
							dbg.location(11,4);
							match(input,PLUS,FOLLOW_PLUS_in_expression50); dbg.location(11,16);
							pushFollow(FOLLOW_mulOrDiv_in_expression54);
							result2=mulOrDiv();
							state._fsp--;
							dbg.location(11,26);
							output+=result2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:13:4: MINUS result2= mulOrDiv
							{
							dbg.location(13,4);
							match(input,MINUS,FOLLOW_MINUS_in_expression66); dbg.location(13,17);
							pushFollow(FOLLOW_mulOrDiv_in_expression70);
							result2=mulOrDiv();
							state._fsp--;
							dbg.location(13,27);
							output-=result2;
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
		dbg.location(15, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return output;
	}
	// $ANTLR end "expression"



	// $ANTLR start "mulOrDiv"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:17:1: mulOrDiv returns [Integer output] : result1= bitOperations ( ( MUL result2= bitOperations | DIV result3= bitOperations | MOD result4= bitOperations ) )* ;
	public final Integer mulOrDiv() throws RecognitionException {
		Integer output = null;


		Integer result1 =null;
		Integer result2 =null;
		Integer result3 =null;
		Integer result4 =null;

		try { dbg.enterRule(getGrammarFileName(), "mulOrDiv");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:17:34: (result1= bitOperations ( ( MUL result2= bitOperations | DIV result3= bitOperations | MOD result4= bitOperations ) )* )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:18:2: result1= bitOperations ( ( MUL result2= bitOperations | DIV result3= bitOperations | MOD result4= bitOperations ) )*
			{
			dbg.location(18,9);
			pushFollow(FOLLOW_bitOperations_in_mulOrDiv94);
			result1=bitOperations();
			state._fsp--;
			dbg.location(18,24);
			output =result1;dbg.location(19,2);
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:19:2: ( ( MUL result2= bitOperations | DIV result3= bitOperations | MOD result4= bitOperations ) )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==DIV||(LA5_0 >= MOD && LA5_0 <= MUL)) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:19:3: ( MUL result2= bitOperations | DIV result3= bitOperations | MOD result4= bitOperations )
					{
					dbg.location(19,3);
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:19:3: ( MUL result2= bitOperations | DIV result3= bitOperations | MOD result4= bitOperations )
					int alt4=3;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					switch ( input.LA(1) ) {
					case MUL:
						{
						alt4=1;
						}
						break;
					case DIV:
						{
						alt4=2;
						}
						break;
					case MOD:
						{
						alt4=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:20:3: MUL result2= bitOperations
							{
							dbg.location(20,3);
							match(input,MUL,FOLLOW_MUL_in_mulOrDiv104); dbg.location(20,14);
							pushFollow(FOLLOW_bitOperations_in_mulOrDiv108);
							result2=bitOperations();
							state._fsp--;
							dbg.location(20,29);
							output*=result2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:22:3: DIV result3= bitOperations
							{
							dbg.location(22,3);
							match(input,DIV,FOLLOW_DIV_in_mulOrDiv118); dbg.location(22,14);
							pushFollow(FOLLOW_bitOperations_in_mulOrDiv122);
							result3=bitOperations();
							state._fsp--;
							dbg.location(22,29);

										if(result3 == 0) throw new ArithmeticException();
										else output/=result3;
									
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:27:3: MOD result4= bitOperations
							{
							dbg.location(27,3);
							match(input,MOD,FOLLOW_MOD_in_mulOrDiv131); dbg.location(27,14);
							pushFollow(FOLLOW_bitOperations_in_mulOrDiv135);
							result4=bitOperations();
							state._fsp--;
							dbg.location(27,29);
							output%=result4;
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
		catch (ArithmeticException e) {
			System.out.println("Division by zero is forbidden.");
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(29, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mulOrDiv");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return output;
	}
	// $ANTLR end "mulOrDiv"



	// $ANTLR start "bitOperations"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:32:1: bitOperations returns [Integer output] : result1= atom ( ( BIT_OR result2= atom | BIT_AND result3= atom | BIT_XOR result4= atom ) )* ;
	public final Integer bitOperations() throws RecognitionException {
		Integer output = null;


		Integer result1 =null;
		Integer result2 =null;
		Integer result3 =null;
		Integer result4 =null;

		try { dbg.enterRule(getGrammarFileName(), "bitOperations");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:32:39: (result1= atom ( ( BIT_OR result2= atom | BIT_AND result3= atom | BIT_XOR result4= atom ) )* )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:33:2: result1= atom ( ( BIT_OR result2= atom | BIT_AND result3= atom | BIT_XOR result4= atom ) )*
			{
			dbg.location(33,9);
			pushFollow(FOLLOW_atom_in_bitOperations165);
			result1=atom();
			state._fsp--;
			dbg.location(33,15);
			output =result1;dbg.location(34,2);
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:34:2: ( ( BIT_OR result2= atom | BIT_AND result3= atom | BIT_XOR result4= atom ) )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==BIT_AND||(LA7_0 >= BIT_OR && LA7_0 <= BIT_XOR)) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:34:3: ( BIT_OR result2= atom | BIT_AND result3= atom | BIT_XOR result4= atom )
					{
					dbg.location(34,3);
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:34:3: ( BIT_OR result2= atom | BIT_AND result3= atom | BIT_XOR result4= atom )
					int alt6=3;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					switch ( input.LA(1) ) {
					case BIT_OR:
						{
						alt6=1;
						}
						break;
					case BIT_AND:
						{
						alt6=2;
						}
						break;
					case BIT_XOR:
						{
						alt6=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:35:3: BIT_OR result2= atom
							{
							dbg.location(35,3);
							match(input,BIT_OR,FOLLOW_BIT_OR_in_bitOperations175); dbg.location(35,17);
							pushFollow(FOLLOW_atom_in_bitOperations179);
							result2=atom();
							state._fsp--;
							dbg.location(35,23);
							output =output | result2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:37:3: BIT_AND result3= atom
							{
							dbg.location(37,3);
							match(input,BIT_AND,FOLLOW_BIT_AND_in_bitOperations189); dbg.location(37,18);
							pushFollow(FOLLOW_atom_in_bitOperations193);
							result3=atom();
							state._fsp--;
							dbg.location(37,24);
							output =output & result3;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:39:3: BIT_XOR result4= atom
							{
							dbg.location(39,3);
							match(input,BIT_XOR,FOLLOW_BIT_XOR_in_bitOperations202); dbg.location(39,18);
							pushFollow(FOLLOW_atom_in_bitOperations206);
							result4=atom();
							state._fsp--;
							dbg.location(39,24);
							output =output ^ result4;
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
		dbg.location(41, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bitOperations");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return output;
	}
	// $ANTLR end "bitOperations"



	// $ANTLR start "atom"
	// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:44:1: atom returns [Integer output] : ( INT | LP expression RP | BIT_NOT result= atom );
	public final Integer atom() throws RecognitionException {
		Integer output = null;


		Token INT2=null;
		Integer result =null;
		Integer expression3 =null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:44:30: ( INT | LP expression RP | BIT_NOT result= atom )
			int alt8=3;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt8=1;
				}
				break;
			case LP:
				{
				alt8=2;
				}
				break;
			case BIT_NOT:
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

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:45:2: INT
					{
					dbg.location(45,2);
					INT2=(Token)match(input,INT,FOLLOW_INT_in_atom228); dbg.location(45,6);
					output =Integer.parseInt((INT2!=null?INT2.getText():null));
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:47:2: LP expression RP
					{
					dbg.location(47,2);
					match(input,LP,FOLLOW_LP_in_atom237); dbg.location(47,5);
					pushFollow(FOLLOW_expression_in_atom239);
					expression3=expression();
					state._fsp--;
					dbg.location(47,16);
					match(input,RP,FOLLOW_RP_in_atom241); dbg.location(47,19);
					output =expression3;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:49:2: BIT_NOT result= atom
					{
					dbg.location(49,2);
					match(input,BIT_NOT,FOLLOW_BIT_NOT_in_atom249); dbg.location(49,16);
					pushFollow(FOLLOW_atom_in_atom253);
					result=atom();
					state._fsp--;
					dbg.location(49,22);
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
		dbg.location(50, 0);

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



	public static final BitSet FOLLOW_expression_in_program12 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_NL_in_program16 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_EOF_in_program21 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulOrDiv_in_expression38 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_PLUS_in_expression50 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_mulOrDiv_in_expression54 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_MINUS_in_expression66 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_mulOrDiv_in_expression70 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_bitOperations_in_mulOrDiv94 = new BitSet(new long[]{0x000000000000C402L});
	public static final BitSet FOLLOW_MUL_in_mulOrDiv104 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_bitOperations_in_mulOrDiv108 = new BitSet(new long[]{0x000000000000C402L});
	public static final BitSet FOLLOW_DIV_in_mulOrDiv118 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_bitOperations_in_mulOrDiv122 = new BitSet(new long[]{0x000000000000C402L});
	public static final BitSet FOLLOW_MOD_in_mulOrDiv131 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_bitOperations_in_mulOrDiv135 = new BitSet(new long[]{0x000000000000C402L});
	public static final BitSet FOLLOW_atom_in_bitOperations165 = new BitSet(new long[]{0x00000000000000D2L});
	public static final BitSet FOLLOW_BIT_OR_in_bitOperations175 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_atom_in_bitOperations179 = new BitSet(new long[]{0x00000000000000D2L});
	public static final BitSet FOLLOW_BIT_AND_in_bitOperations189 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_atom_in_bitOperations193 = new BitSet(new long[]{0x00000000000000D2L});
	public static final BitSet FOLLOW_BIT_XOR_in_bitOperations202 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_atom_in_bitOperations206 = new BitSet(new long[]{0x00000000000000D2L});
	public static final BitSet FOLLOW_INT_in_atom228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_atom237 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_expression_in_atom239 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_RP_in_atom241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_NOT_in_atom249 = new BitSet(new long[]{0x0000000000001820L});
	public static final BitSet FOLLOW_atom_in_atom253 = new BitSet(new long[]{0x0000000000000002L});
}
