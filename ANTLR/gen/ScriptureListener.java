// Generated from D:/git/ScriptureReferenceRecognition/ANTLR\Scripture.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScriptureParser}.
 */
public interface ScriptureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ScriptureParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ScriptureParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#scripture}.
	 * @param ctx the parse tree
	 */
	void enterScripture(ScriptureParser.ScriptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#scripture}.
	 * @param ctx the parse tree
	 */
	void exitScripture(ScriptureParser.ScriptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#book}.
	 * @param ctx the parse tree
	 */
	void enterBook(ScriptureParser.BookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#book}.
	 * @param ctx the parse tree
	 */
	void exitBook(ScriptureParser.BookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(ScriptureParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(ScriptureParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#addr}.
	 * @param ctx the parse tree
	 */
	void enterAddr(ScriptureParser.AddrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#addr}.
	 * @param ctx the parse tree
	 */
	void exitAddr(ScriptureParser.AddrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#addrverse}.
	 * @param ctx the parse tree
	 */
	void enterAddrverse(ScriptureParser.AddrverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#addrverse}.
	 * @param ctx the parse tree
	 */
	void exitAddrverse(ScriptureParser.AddrverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#chapter}.
	 * @param ctx the parse tree
	 */
	void enterChapter(ScriptureParser.ChapterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#chapter}.
	 * @param ctx the parse tree
	 */
	void exitChapter(ScriptureParser.ChapterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#verselist}.
	 * @param ctx the parse tree
	 */
	void enterVerselist(ScriptureParser.VerselistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#verselist}.
	 * @param ctx the parse tree
	 */
	void exitVerselist(ScriptureParser.VerselistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#verse}.
	 * @param ctx the parse tree
	 */
	void enterVerse(ScriptureParser.VerseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#verse}.
	 * @param ctx the parse tree
	 */
	void exitVerse(ScriptureParser.VerseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#translation}.
	 * @param ctx the parse tree
	 */
	void enterTranslation(ScriptureParser.TranslationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#translation}.
	 * @param ctx the parse tree
	 */
	void exitTranslation(ScriptureParser.TranslationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptureParser#ordinal}.
	 * @param ctx the parse tree
	 */
	void enterOrdinal(ScriptureParser.OrdinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptureParser#ordinal}.
	 * @param ctx the parse tree
	 */
	void exitOrdinal(ScriptureParser.OrdinalContext ctx);
}