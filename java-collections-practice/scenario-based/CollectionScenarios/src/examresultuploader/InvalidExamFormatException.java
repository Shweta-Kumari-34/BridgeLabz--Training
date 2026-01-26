package examresultuploader;

/**
 * Exception raised for invalid CSV format or missing marks
 */
public class InvalidExamFormatException extends Exception {
    public InvalidExamFormatException(String message) {
        super(message);
    }
}

