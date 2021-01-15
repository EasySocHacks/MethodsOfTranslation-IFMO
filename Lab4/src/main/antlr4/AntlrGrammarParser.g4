grammar AntlrGrammarParser;

@header {
  import grammar.objects.terminals.Terminal;
  import grammar.objects.nonterminals.NonTerminal;
}

parse returns [List<Terminal> termList, List<NonTerminal> nonTermList]
    :   terminalListValue=terminalList { $termList = $terminalListValue.list; }
        lineSeparator
        nonTerminalListValue=nonTerminalList { $nonTermList = $nonTerminalListValue.list; }
    ;

terminalList returns [List<Terminal> list]
    :   'terminals:' { $list = new ArrayList(); }
        (terminalValue=terminal { $list.add($terminalValue.term); } )+
    ;

terminal returns [Terminal term]
    :   lineSeparator '- ' name=LowName { $term = new Terminal($name.text); }
    ;

nonTerminalList returns [List<NonTerminal> list]
    :   'non-terminals:' { $list = new ArrayList(); }
        (nonTerminalValue=nonTerminal { $list.add($nonTerminal.nonterm); } )+
    ;

nonTerminal returns [NonTerminal nonterm]
    :   lineSeparator '- ' name=HighName { $nonterm = new NonTerminal($name.text); }
    ;

lineSeparator
    : ('\r')? '\n'
    ;

LowName
    :   ('a'..'z')+
    ;

HighName
    :   ('A'..'Z')+
    ;