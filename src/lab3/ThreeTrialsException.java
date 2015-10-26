/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author MCENDROWSKI
 */
public class ThreeTrialsException extends Exception {
    private static final String MSG = "Sorry.You have tried 3 times. Application will terminate.";
    public ThreeTrialsException() {
    super(MSG);
    }

    public ThreeTrialsException(String string) {
        this();
    }

    public ThreeTrialsException(String string, Throwable thrwbl) {
        this();
    }

    public ThreeTrialsException(Throwable thrwbl) {
        this();
    }
    
}
