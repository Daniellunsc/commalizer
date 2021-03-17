package strategies;

import interfaces.ProcessStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SingleQuote implements ProcessStrategy {
    @Override
    public String process(String input, String separator, String outputSeparator) {
        String[] splitedInput = input.split(separator);
        StringBuilder stringBuilder = new StringBuilder();
        List<String> str = new ArrayList<>();
        for (String splitInput: splitedInput) {
            stringBuilder.append("'").append(splitInput).append("'");
            splitInput = stringBuilder.toString();
            str.add(splitInput);
            stringBuilder.delete(0, splitedInput.length);
        }


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
