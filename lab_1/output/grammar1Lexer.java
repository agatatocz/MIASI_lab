// $ANTLR 3.5.1 /home/agata/Pulpit/MIASI/lab_1/grammar1.g 2020-03-04 11:15:03

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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:53:5: ( ( '0' .. '9' )+ )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:53:7: ( '0' .. '9' )+
			{
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:53:7: ( '0' .. '9' )+
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

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:56:5: ( ( 'true' | 'false' ) )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:56:7: ( 'true' | 'false' )
			{
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:56:7: ( 'true' | 'false' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='t') ) {
				alt2=1;
			}
			else if ( (LA2_0=='f') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:56:8: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:56:15: 'false'
					{
					match("false"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:59:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:59:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:59:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
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
							break loop3;
						}
					}

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:59:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:59:28: '\\r'
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
					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:60:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:60:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:60:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:63:5: ( ( ' ' | '\\t' | '\\r' ) )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:63:9: ( ' ' | '\\t' | '\\r' )
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:69:3: ( '\\n' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:69:5: '\\n'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:70:5: ( '+' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:70:7: '+'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:71:6: ( '-' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:71:8: '-'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:72:4: ( '*' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:72:6: '*'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:73:4: ( '/' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:73:6: '/'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:74:3: ( '(' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:74:5: '('
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:75:3: ( ')' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:75:5: ')'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:76:4: ( '%' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:76:6: '%'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:77:7: ( '|' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:77:9: '|'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:78:8: ( '&' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:78:10: '&'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:79:8: ( '^' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:79:10: '^'
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
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:80:8: ( '~' )
			// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:80:10: '~'
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

	@Override
	public void mTokens() throws RecognitionException {
		// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:8: ( INT | BOOL | COMMENT | WS | NL | PLUS | MINUS | MUL | DIV | LP | RP | MOD | BIT_OR | BIT_AND | BIT_XOR | BIT_NOT )
		int alt7=16;
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
			alt7=1;
			}
			break;
		case 'f':
		case 't':
			{
			alt7=2;
			}
			break;
		case '/':
			{
			int LA7_3 = input.LA(2);
			if ( (LA7_3=='*'||LA7_3=='/') ) {
				alt7=3;
			}

			else {
				alt7=9;
			}

			}
			break;
		case '\t':
		case '\r':
		case ' ':
			{
			alt7=4;
			}
			break;
		case '\n':
			{
			alt7=5;
			}
			break;
		case '+':
			{
			alt7=6;
			}
			break;
		case '-':
			{
			alt7=7;
			}
			break;
		case '*':
			{
			alt7=8;
			}
			break;
		case '(':
			{
			alt7=10;
			}
			break;
		case ')':
			{
			alt7=11;
			}
			break;
		case '%':
			{
			alt7=12;
			}
			break;
		case '|':
			{
			alt7=13;
			}
			break;
		case '&':
			{
			alt7=14;
			}
			break;
		case '^':
			{
			alt7=15;
			}
			break;
		case '~':
			{
			alt7=16;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);
			throw nvae;
		}
		switch (alt7) {
			case 1 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:10: INT
				{
				mINT(); 

				}
				break;
			case 2 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:14: BOOL
				{
				mBOOL(); 

				}
				break;
			case 3 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:19: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 4 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:27: WS
				{
				mWS(); 

				}
				break;
			case 5 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:30: NL
				{
				mNL(); 

				}
				break;
			case 6 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:33: PLUS
				{
				mPLUS(); 

				}
				break;
			case 7 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:38: MINUS
				{
				mMINUS(); 

				}
				break;
			case 8 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:44: MUL
				{
				mMUL(); 

				}
				break;
			case 9 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:48: DIV
				{
				mDIV(); 

				}
				break;
			case 10 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:52: LP
				{
				mLP(); 

				}
				break;
			case 11 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:55: RP
				{
				mRP(); 

				}
				break;
			case 12 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:58: MOD
				{
				mMOD(); 

				}
				break;
			case 13 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:62: BIT_OR
				{
				mBIT_OR(); 

				}
				break;
			case 14 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:69: BIT_AND
				{
				mBIT_AND(); 

				}
				break;
			case 15 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:77: BIT_XOR
				{
				mBIT_XOR(); 

				}
				break;
			case 16 :
				// /home/agata/Pulpit/MIASI/lab_1/grammar1.g:1:85: BIT_NOT
				{
				mBIT_NOT(); 

				}
				break;

		}
	}



}
