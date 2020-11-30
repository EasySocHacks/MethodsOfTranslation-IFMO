package exception;

public class ParserVariableNotFoundException extends Exception {
    public ParserVariableNotFoundException(String message) {
        super(message);
    }

    public ParserVariableNotFoundException(String message, Exception e) {
        super(message, e);
    }
}
