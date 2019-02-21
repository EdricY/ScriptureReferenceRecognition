import org.antlr.v4.runtime.*;
import java.io.FileInputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("inputs/test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        ScriptureLexer lexer = new ScriptureLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ScriptureParser parser = new ScriptureParser(tokens);
        parser.prog(); // parse the input stream!
    }
}
