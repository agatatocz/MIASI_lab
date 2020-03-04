// $ANTLR 3.5.1 /home/agata/Pulpit/MIASI/lab_1/grammar1.g 2020-03-04 11:58:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class grammar1Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public grammar1Lexer() {} 
	public grammar1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public grammar1Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/agata/Pulpit/MIASI/lab_1/grammar1.g"; }

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:65:5: ( ( '0' .. '9' )+ )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:65:7: ( '0' .. '9' )+
			{
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:65:7: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:69:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='/') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='/') ) {
					alt5=1;
				}
				else if ( (LA5_1=='*') ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:69:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:69:14: (~ ( '\\n' | '\\r' ) )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:69:28: ( '\\r' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='\r') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:69:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:70:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:70:14: ( options {greedy=false; } : . )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0=='*') ) {
							int LA4_1 = input.LA(2);
							if ( (LA4_1=='/') ) {
								alt4=2;
							}
							else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
								alt4=1;
							}

						}
						else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:70:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop4;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:73:5: ( ( ' ' | '\\t' | '\\r' ) )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:73:9: ( ' ' | '\\t' | '\\r' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:79:3: ( '\\n' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:79:5: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NL"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:80:5: ( '+' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:80:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:81:6: ( '-' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:81:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:82:4: ( '*' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:82:6: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:83:4: ( '/' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:83:6: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:84:3: ( '(' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:84:5: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:85:3: ( ')' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:85:5: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:86:4: ( '%' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:86:6: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "BIT_OR"
	public final void mBIT_OR() throws RecognitionException {
		try {
			int _type = BIT_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:87:7: ( '|' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:87:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_OR"

	// $ANTLR start "BIT_AND"
	public final void mBIT_AND() throws RecognitionException {
		try {
			int _type = BIT_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:88:8: ( '&' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:88:10: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_AND"

	// $ANTLR start "BIT_XOR"
	public final void mBIT_XOR() throws RecognitionException {
		try {
			int _type = BIT_XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:89:8: ( '^' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:89:10: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_XOR"

	// $ANTLR start "BIT_NOT"
	public final void mBIT_NOT() throws RecognitionException {
		try {
			int _type = BIT_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:90:8: ( '~' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:90:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_NOT"

	// $ANTLR start "SHIFT_L"
	public final void mSHIFT_L() throws RecognitionException {
		try {
			int _type = SHIFT_L;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:91:8: ( '<<' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:91:10: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHIFT_L"

	// $ANTLR start "SHIFT_R"
	public final void mSHIFT_R() throws RecognitionException {
		try {
			int _type = SHIFT_R;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:92:8: ( '>>' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:92:10: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHIFT_R"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:8: ( INT | COMMENT | WS | NL | PLUS | MINUS | MUL | DIV | LP | RP | MOD | BIT_OR | BIT_AND | BIT_XOR | BIT_NOT | SHIFT_L | SHIFT_R )
		int alt6=17;
		switch ( input.LA(1) ) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt6=1;
			}
			break;
		case '/':
			{
			int LA6_2 = input.LA(2);
			if ( (LA6_2=='*'||LA6_2=='/') ) {
				alt6=2;
			}

			else {
				alt6=8;
			}

			}
			break;
		case '\t':
		case '\r':
		case ' ':
			{
			alt6=3;
			}
			break;
		case '\n':
			{
			alt6=4;
			}
			break;
		case '+':
			{
			alt6=5;
			}
			break;
		case '-':
			{
			alt6=6;
			}
			break;
		case '*':
			{
			alt6=7;
			}
			break;
		case '(':
			{
			alt6=9;
			}
			break;
		case ')':
			{
			alt6=10;
			}
			break;
		case '%':
			{
			alt6=11;
			}
			break;
		case '|':
			{
			alt6=12;
			}
			break;
		case '&':
			{
			alt6=13;
			}
			break;
		case '^':
			{
			alt6=14;
			}
			break;
		case '~':
			{
			alt6=15;
			}
			break;
		case '<':
			{
			alt6=16;
			}
			break;
		case '>':
			{
			alt6=17;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 6, 0, input);
			throw nvae;
		}
		switch (alt6) {
			case 1 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:10: INT
				{
				mINT(); 

				}
				break;
			case 2 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:14: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 3 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:22: WS
				{
				mWS(); 

				}
				break;
			case 4 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:25: NL
				{
				mNL(); 

				}
				break;
			case 5 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:28: PLUS
				{
				mPLUS(); 

				}
				break;
			case 6 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:33: MINUS
				{
				mMINUS(); 

				}
				break;
			case 7 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:39: MUL
				{
				mMUL(); 

				}
				break;
			case 8 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:43: DIV
				{
				mDIV(); 

				}
				break;
			case 9 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:47: LP
				{
				mLP(); 

				}
				break;
			case 10 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:50: RP
				{
				mRP(); 

				}
				break;
			case 11 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:53: MOD
				{
				mMOD(); 

				}
				break;
			case 12 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:57: BIT_OR
				{
				mBIT_OR(); 

				}
				break;
			case 13 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:64: BIT_AND
				{
				mBIT_AND(); 

				}
				break;
			case 14 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:72: BIT_XOR
				{
				mBIT_XOR(); 

				}
				break;
			case 15 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:80: BIT_NOT
				{
				mBIT_NOT(); 

				}
				break;
			case 16 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:88: SHIFT_L
				{
				mSHIFT_L(); 

				}
				break;
			case 17 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:96: SHIFT_R
				{
				mSHIFT_R(); 

				}
				break;

		}
	}



}
