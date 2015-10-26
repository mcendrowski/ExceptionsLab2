package lab0;

/**
 *
 * @author jlombardo
 */
public class MandatoryEntryException extends Exception {

    public MandatoryEntryException() {
    }

    public MandatoryEntryException(String message) {
        super(message);
    }

    public MandatoryEntryException(String message, Throwable cause) {
        super(message, cause);
    }

    public MandatoryEntryException(Throwable cause) {
        super(cause);
    }

    public MandatoryEntryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
