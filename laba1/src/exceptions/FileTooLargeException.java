package exceptions;

public class FileTooLargeException extends FileException {
    public FileTooLargeException(String message) {
        super(message);
    }
}