package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again. (Yes, this violates the
 * Single Responsibility Principle, but for this lab, we'll overlook that.)
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;
    private int x;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        boolean askAgain = false;
        String fullName = null;
        String lastName = null;
        int index = 0;
        boolean properName = true;

        do {
            fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");

            try {
                lastName = app.extractLastName(fullName);
                askAgain = false;

            } catch (IllegalArgumentException iae) {
                index++;
                
                if (index == 3) {
                    properName = false;
                    askAgain = false;
//                    break;
                }
                else {
                    JOptionPane.showMessageDialog(null, iae.getMessage());
                    askAgain = true;
                }
                
            }
        } while (askAgain);

        String msg="";
        if (properName) {
            msg = "Your last name is: " + lastName;
        } else {
            try{
            throw new IllegalArgumentException("Sorry. No proper name chosen 3 times.Program is terminating.");}
            catch (IllegalArgumentException iae2){
                JOptionPane.showMessageDialog(null, iae2.getMessage());
            }
//            msg = "Sorry. No proper name chosen 3 times.Program is terminating.";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    /**
     * Attempts to extract last name from full name constructed of two parts --
     * first name and last name. This method cannot guarantee that the last part
     * is the last name. It must assume so. Be careful.
     *
     * @param fullName - a multi-part entry representing a full name
     * @return
     * @throws IllegalArgumentException if full name == null or full name is
     * empty or full name has less than two parts. If full name has more than
     * two parts no exception will be thrown because we cannot know if the last
     * part is definitely a last name. So we will assume it is.
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Sorry you must provide a full name");
        }

        String[] parts = fullName.split(" ");
        if (parts.length < 2) {
            throw new IllegalArgumentException("Sorry you must provide both a first name and last name");
        }

        return parts[parts.length - 1];
    }

}
