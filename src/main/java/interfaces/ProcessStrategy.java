package interfaces;

public interface ProcessStrategy {
    String process(String input, String separator, String outputSeparator);
    String process(String input, String separator, String outputSeparator, Boolean TrimWhiteSpace);
}
