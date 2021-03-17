import interfaces.ProcessStrategy;
import strategies.DoubleQuote;
import strategies.NoQuote;
import strategies.SingleQuote;

public class commalizer {

    public static void main(String[] args) {
        ProcessStrategy strategy = new DoubleQuote();
        String result = strategy.process("a, b, c, d,", ",", ",", true);
        System.out.println(result);

        ProcessStrategy strategySingleQuote = new SingleQuote();
        String result2 = strategySingleQuote.process("a, b, c, d,", ",", ".", true);
        System.out.println(result2);

        ProcessStrategy noQuote = new NoQuote();
        String result3 = noQuote.process("a, b, c, d,", ",", "|", true);
        System.out.println(result3);
    }
}
