package exceptions;

public class PasswordTooShortException extends Exception {
    public PasswordTooShortException(String message) {
        super(message);
    }
}
