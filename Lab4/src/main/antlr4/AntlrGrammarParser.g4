grammar AntlrGrammarParser;

@header {
    import grammar.Grammar;
    import grammar.objects.terminals.Terminal;
    import grammar.objects.terminals.Terminal.TerminalOption;
    import grammar.objects.nonterminals.NonTerminal;
    import grammar.rules.Rule;
    import grammar.objects.GrammarObject;
    import grammar.objects.nonterminals.translators.Translator;
    import grammar.objects.nonterminals.translators.TranslatorEnum;
    import grammar.objects.attributes.Attribute;
    import grammar.objects.attributes.Attribute.AttributeType;
}

parse returns [Grammar grammar]
    :   terminalListValue=terminalList
        lineSeparator
        nonTerminalListValue=nonTerminalList
        lineSeparator
        startNonTerminalValue=startNonTerminal
        lineSeparator
        ruleListValue=ruleList
        { $grammar = new Grammar($terminalListValue.list, $nonTerminalListValue.list, $startNonTerminalValue.start, $ruleListValue.list); }
    ;

terminalList returns [List<Terminal> list]
    :   'terminals:' { $list = new ArrayList(); }
        (lineSeparator maybeWhitespaces '-' atLeastWhitespaces terminalValue=terminal
        (
            maybeWhitespaces ':' maybeWhitespaces optionValue=terminalOption
            { $terminalValue.term = new Terminal($terminalValue.term.getName(), $optionValue.option); }
        )?
        (
            maybeWhitespaces '{' maybeWhitespaces
            attributeFirstValue=attribute
            { $terminalValue.term.getAttributes().put($attributeFirstValue.attr.getName(), $attributeFirstValue.attr); }
            (
                maybeWhitespaces ',' maybeWhitespaces
                attributeValue=attribute
                { $terminalValue.term.getAttributes().put($attributeValue.attr.getName(), $attributeValue.attr); }
            )*
            maybeWhitespaces '}'
        )?
        { $list.add($terminalValue.term); }
        )+
    ;

terminal returns [Terminal term]
    :   name=LowName { $term = new Terminal($name.text); }
    ;

terminalOption returns [TerminalOption option]
    :   name=HighName { $option = TerminalOption.valueOf($name.text); }
    ;

nonTerminalList returns [List<NonTerminal> list]
    :   'non-terminals:' { $list = new ArrayList(); }
        (
            lineSeparator maybeWhitespaces '-' atLeastWhitespaces nonTerminalValue=nonTerminal
            (
                maybeWhitespaces '{' maybeWhitespaces
                attributeFirstValue=attribute
                { $nonTerminal.nonterm.getAttributes().put($attributeFirstValue.attr.getName(), $attributeFirstValue.attr); }
                (
                    maybeWhitespaces ',' maybeWhitespaces
                    attributeValue=attribute
                    { $nonTerminal.nonterm.getAttributes().put($attributeValue.attr.getName(), $attributeValue.attr); }
                )*
                maybeWhitespaces '}'
            )?
            { $list.add($nonTerminal.nonterm); }
        )+
    ;

nonTerminal returns [NonTerminal nonterm]
    :   name=HighName { $nonterm = new NonTerminal($name.text); }
    ;

startNonTerminal returns [NonTerminal start]
    :   'start-non-terminal:' atLeastWhitespaces name=HighName { $start = new NonTerminal($name.text); }
    ;

ruleList returns [List<Rule> list]
    :   'rules:' { $list = new ArrayList(); }
        (lineSeparator maybeWhitespaces '-' atLeastWhitespaces ruleAttrsValue=ruleAttrs
        { $list.add(new Rule($ruleAttrsValue.fromNonTerminal, $ruleAttrsValue.grammarObjectsList)); })+
    ;

ruleAttrs returns [NonTerminal fromNonTerminal, List<GrammarObject> grammarObjectsList]
    :   { $grammarObjectsList = new ArrayList(); }
        nonTerminalValue=nonTerminal { $fromNonTerminal = $nonTerminalValue.nonterm; }
        atLeastWhitespaces '->'
        (
            atLeastWhitespaces
            (
                (terminalValue=terminal { $grammarObjectsList.add($terminalValue.term); })
                |
                (nonTerminalValue=nonTerminal { $grammarObjectsList.add($nonTerminalValue.nonterm); })
                |
                (translatorValue=translator { $grammarObjectsList.add($translatorValue.currentTranslator); })
            )
        )+
    ;

attribute returns [Attribute attr]
    :   name=LowName maybeWhitespaces ':' maybeWhitespaces
        (
            'SYNTHESIZED' { $attr = new Attribute($name.text, AttributeType.SYNTHESIZED); }
            |
            'INHERITED' { $attr = new Attribute($name.text, AttributeType.INHERITED); }
        )
    ;

translator returns [Translator currentTranslator]
    :   '$' name=HighName { $currentTranslator = (TranslatorEnum.valueOf($name.text)).getTranslator(); }
    ;

lineSeparator
    : ('\r')? '\n'
    ;

atLeastWhitespaces
    :   Whitespace+
    ;

maybeWhitespaces
    :   Whitespace*
    ;

LowName
    :   (
            ('a'..'z')
            |
            '('
            |
            ')'
            |
            ('0'..'1')
        )+
        ;

HighName
    :   ('A'..'Z')+
    ;

Whitespace
    :   (' ' | '\t' | '\r' | '\n')
    ;