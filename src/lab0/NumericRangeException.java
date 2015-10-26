package lab0;

/**
 *
 * @author jlombardo
 */
public class NumericRangeException extends Exception {
    private static final String MSG = 
            "Sorry your input is out of acceptable range";

    public NumericRangeException() {
        super(MSG);
    }

    public NumericRangeException(String message) {
        super(MSG);
    }

    public NumericRangeException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public NumericRangeException(Throwable cause) {
        super(MSG,cause);
    }
    
}
