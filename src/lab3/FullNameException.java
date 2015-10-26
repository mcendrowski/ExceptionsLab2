package lab3;

/**
 *
 * @author jlombardo
 */
public class FullNameException extends IllegalArgumentException {
    private static final String MSG = "Sorry you must provide both first and last name";
    

public FullNameException(){
    super(MSG);
}
    
    
//    public FullNameException() {
////        super(MSG);
//        this();
//    }

    public FullNameException(String s) {
//        super(MSG);
        this();
    }
    

    public FullNameException(Throwable cause) {
//        super(MSG);
        this();
    }
    
    public FullNameException(String message, Throwable cause) {
        this();
    }
    
}
