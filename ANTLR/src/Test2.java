import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileInputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("inputs/exprtests.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        parser.prog(); // parse the input stream!
    };
}
