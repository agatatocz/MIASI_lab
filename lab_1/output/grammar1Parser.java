// $ANTLR 3.5.1 /home/agata/Pulpit/MIASI/grammar1.g 2020-03-01 20:24:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class grammar1Parser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIV", "ID", "INT", 
		"LP", "MINUS", "MUL", "NL", "PLUS", "RP", "WS"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DIV=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int LP=8;
	public static final int MINUS=9;
	public static final int MUL=10;
	public static final int NL=11;
	public static final int PLUS=12;
	public static final int RP=13;
	public static final int WS=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "program", "mulOrDiv", "atom", "expression"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
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
	@Override public String getGrammarFileName() { return "/home/agata/Pulpit/MIASI/grammar1.g"; }



	// $ANTLR start "program"
	// /home/agata/Pulpit/MIASI/grammar1.g:3:1: program : ( expression NL )+ EOF ;
	public final void program() throws RecognitionException {
		Integer expression1 =null;

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(3, 0);

		try {
			// /home/agata/Pulpit/MIASI/grammar1.g:3:8: ( ( expression NL )+ EOF )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/grammar1.g:3:10: ( expression NL )+ EOF
			{
			dbg.location(3,10);
			// /home/agata/Pulpit/MIASI/grammar1.g:3:10: ( expression NL )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= INT && LA1_0 <= LP)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/grammar1.g:3:11: expression NL
					{
					dbg.location(3,11);
					pushFollow(FOLLOW_expression_in_program10);
					expression1=expression();
					state._fsp--;
					dbg.location(3,22);
					System.out.println("result="+expression1);dbg.location(3,74);
					match(input,NL,FOLLOW_NL_in_program14); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(3,79);
			match(input,EOF,FOLLOW_EOF_in_program18); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(3, 81);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "expression"
	// /home/agata/Pulpit/MIASI/grammar1.g:5:1: expression returns [Integer output] : result1= mulOrDiv ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )* ;
	public final Integer expression() throws RecognitionException {
		Integer output = null;


		Integer result1 =null;
		Integer result2 =null;

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(5, 0);

		try {
			// /home/agata/Pulpit/MIASI/grammar1.g:5:36: (result1= mulOrDiv ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )* )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/grammar1.g:6:2: result1= mulOrDiv ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )*
			{
			dbg.location(6,9);
			pushFollow(FOLLOW_mulOrDiv_in_expression33);
			result1=mulOrDiv();
			state._fsp--;
			dbg.location(6,19);
			output =result1;dbg.location(7,3);
			// /home/agata/Pulpit/MIASI/grammar1.g:7:3: ( ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv ) )*
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

					// /home/agata/Pulpit/MIASI/grammar1.g:7:4: ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv )
					{
					dbg.location(7,4);
					// /home/agata/Pulpit/MIASI/grammar1.g:7:4: ( PLUS result2= mulOrDiv | MINUS result2= mulOrDiv )
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

							// /home/agata/Pulpit/MIASI/grammar1.g:7:5: PLUS result2= mulOrDiv
							{
							dbg.location(7,5);
							match(input,PLUS,FOLLOW_PLUS_in_expression41); dbg.location(7,17);
							pushFollow(FOLLOW_mulOrDiv_in_expression45);
							result2=mulOrDiv();
							state._fsp--;
							dbg.location(7,27);
							output+=result2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/agata/Pulpit/MIASI/grammar1.g:9:3: MINUS result2= mulOrDiv
							{
							dbg.location(9,3);
							match(input,MINUS,FOLLOW_MINUS_in_expression56); dbg.location(9,16);
							pushFollow(FOLLOW_mulOrDiv_in_expression60);
							result2=mulOrDiv();
							state._fsp--;
							dbg.location(9,26);
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
		dbg.location(10, 1);

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
	// /home/agata/Pulpit/MIASI/grammar1.g:12:1: mulOrDiv returns [Integer output] : result1= atom ( ( MUL result2= atom | DIV result3= atom ) )* ;
	public final Integer mulOrDiv() throws RecognitionException {
		Integer output = null;


		Integer result1 =null;
		Integer result2 =null;
		Integer result3 =null;

		try { dbg.enterRule(getGrammarFileName(), "mulOrDiv");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// /home/agata/Pulpit/MIASI/grammar1.g:12:34: (result1= atom ( ( MUL result2= atom | DIV result3= atom ) )* )
			dbg.enterAlt(1);

			// /home/agata/Pulpit/MIASI/grammar1.g:13:2: result1= atom ( ( MUL result2= atom | DIV result3= atom ) )*
			{
			dbg.location(13,9);
			pushFollow(FOLLOW_atom_in_mulOrDiv82);
			result1=atom();
			state._fsp--;
			dbg.location(13,15);
			output =result1;dbg.location(14,2);
			// /home/agata/Pulpit/MIASI/grammar1.g:14:2: ( ( MUL result2= atom | DIV result3= atom ) )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==DIV||LA5_0==MUL) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/agata/Pulpit/MIASI/grammar1.g:14:3: ( MUL result2= atom | DIV result3= atom )
					{
					dbg.location(14,3);
					// /home/agata/Pulpit/MIASI/grammar1.g:14:3: ( MUL result2= atom | DIV result3= atom )
					int alt4=2;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					int LA4_0 = input.LA(1);
					if ( (LA4_0==MUL) ) {
						alt4=1;
					}
					else if ( (LA4_0==DIV) ) {
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

							// /home/agata/Pulpit/MIASI/grammar1.g:14:4: MUL result2= atom
							{
							dbg.location(14,4);
							match(input,MUL,FOLLOW_MUL_in_mulOrDiv89); dbg.location(14,15);
							pushFollow(FOLLOW_atom_in_mulOrDiv93);
							result2=atom();
							state._fsp--;
							dbg.location(14,21);
							output*=result2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/agata/Pulpit/MIASI/grammar1.g:16:2: DIV result3= atom
							{
							dbg.location(16,2);
							match(input,DIV,FOLLOW_DIV_in_mulOrDiv102); dbg.location(16,13);
							pushFollow(FOLLOW_atom_in_mulOrDiv106);
							result3=atom();
							state._fsp--;
							dbg.location(16,19);
							output/=result3;
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
		dbg.location(17, 1);

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
	// /home/agata/Pulpit/MIASI/grammar1.g:19:1: atom returns [Integer output] : ( INT | LP expression RP );
	public final Integer atom() throws RecognitionException {
		Integer output = null;


		Token INT2=null;
		Integer expression3 =null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /home/agata/Pulpit/MIASI/grammar1.g:19:30: ( INT | LP expression RP )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==INT) ) {
				alt6=1;
			}
			else if ( (LA6_0==LP) ) {
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

					// /home/agata/Pulpit/MIASI/grammar1.g:20:2: INT
					{
					dbg.location(20,2);
					INT2=(Token)match(input,INT,FOLLOW_INT_in_atom126); dbg.location(20,6);
					output =Integer.parseInt((INT2!=null?INT2.getText():null));
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/agata/Pulpit/MIASI/grammar1.g:22:2: LP expression RP
					{
					dbg.location(22,2);
					match(input,LP,FOLLOW_LP_in_atom135); dbg.location(22,5);
					pushFollow(FOLLOW_expression_in_atom137);
					expression3=expression();
					state._fsp--;
					dbg.location(22,16);
					match(input,RP,FOLLOW_RP_in_atom139); dbg.location(22,19);
					output =expression3;
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
		dbg.location(23, 1);

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



	public static final BitSet FOLLOW_expression_in_program10 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NL_in_program14 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_EOF_in_program18 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulOrDiv_in_expression33 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_PLUS_in_expression41 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_mulOrDiv_in_expression45 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_MINUS_in_expression56 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_mulOrDiv_in_expression60 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_atom_in_mulOrDiv82 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_MUL_in_mulOrDiv89 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_atom_in_mulOrDiv93 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_DIV_in_mulOrDiv102 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_atom_in_mulOrDiv106 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_INT_in_atom126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_atom135 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_expression_in_atom137 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RP_in_atom139 = new BitSet(new long[]{0x0000000000000002L});
}
