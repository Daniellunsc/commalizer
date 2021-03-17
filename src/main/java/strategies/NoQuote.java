package strategies;

import interfaces.ProcessStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoQuote implements ProcessStrategy {
    @Override
    public String process(String input, String separator, String outputSeparator) {
        String[] splitedInput = input.split(separator);
        List<String> str = new ArrayList<>(Arrays.asList(splitedInput));
        return String.join(outputSeparator, str);
    }

    @Override
    public String process(String input, String separator, String outputSeparator, Boolean TrimWhiteSpace) {
        if (TrimWhiteSpace) {
            input = input.replaceAll(" ", "");
        }
        return process(input, separator, outputSeparator);
    }
}
