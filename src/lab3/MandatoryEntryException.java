package lab3;

/**
 *
 * @author jlombardo
 */
public class MandatoryEntryException extends IllegalArgumentException {
    private static final String MSG = "Sorry you must provide some input";
    
    public MandatoryEntryException() {
        super(MSG);
    }

    public MandatoryEntryException(String s) {
        this();
    }

    public MandatoryEntryException(String message, Throwable cause) {
        this();
    }

    public MandatoryEntryException(Throwable cause) {
        this();
    }
    
}
