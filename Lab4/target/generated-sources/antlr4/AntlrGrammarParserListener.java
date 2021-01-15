// Generated from AntlrGrammarParser.g4 by ANTLR 4.7.1

  import grammar.objects.terminals.Terminal;
  import grammar.objects.nonterminals.NonTerminal;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrGrammarParserParser}.
 */
public interface AntlrGrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrGrammarParserParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(AntlrGrammarParserParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGrammarParserParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(AntlrGrammarParserParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGrammarParserParser#terminalList}.
	 * @param ctx the parse tree
	 */
	void enterTerminalList(AntlrGrammarParserParser.TerminalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGrammarParserParser#terminalList}.
	 * @param ctx the parse tree
	 */
	void exitTerminalList(AntlrGrammarParserParser.TerminalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGrammarParserParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(AntlrGrammarParserParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGrammarParserParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(AntlrGrammarParserParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGrammarParserParser#nonTerminalList}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalList(AntlrGrammarParserParser.NonTerminalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGrammarParserParser#nonTerminalList}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalList(AntlrGrammarParserParser.NonTerminalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGrammarParserParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminal(AntlrGrammarParserParser.NonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGrammarParserParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminal(AntlrGrammarParserParser.NonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGrammarParserParser#lineSeparator}.
	 * @param ctx the parse tree
	 */
	void enterLineSeparator(AntlrGrammarParserParser.LineSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGrammarParserParser#lineSeparator}.
	 * @param ctx the parse tree
	 */
	void exitLineSeparator(AntlrGrammarParserParser.LineSeparatorContext ctx);
}