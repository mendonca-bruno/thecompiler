package gram;


import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import gramaticona.myGramLexer;
import gramaticona.myGramParser;
import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.tree.ParseTree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CC44984357886
 */
public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = new ANTLRFileStream("input.txt");
        myGramLexer lexer = new myGramLexer(input);
        TokenStream tokens = new BufferedTokenStream(lexer);
        myGramParser parser = new myGramParser(tokens);
        myGramParser.ProgContext lang = parser.prog();
        showParseTreeFrame(lang,parser);
    }
    
    private static void showParseTreeFrame(ParseTree tree, myGramParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

