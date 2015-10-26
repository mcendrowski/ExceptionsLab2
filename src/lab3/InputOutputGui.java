package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
       
        String lastName = null;
        boolean askAgain = true;
        int numberOfTrials=0;
        
        do {
         String fullName = JOptionPane.showInputDialog("Enter full name:");
         numberOfTrials++;
            try {
            if (numberOfTrials==3){
                throw new ThreeTrialsException();
            }
           
            lastName = nameService.extractLastName(fullName); 
            askAgain=false;
        }
         catch (ThreeTrialsException tte){
                  JOptionPane.showMessageDialog(null, tte.getMessage());
                    askAgain=false;
                    }
        
        catch (MandatoryEntryException mee){
           JOptionPane.showMessageDialog(null, mee.getMessage());
           askAgain=true;
        }
        catch(FullNameException fne) {
            JOptionPane.showMessageDialog(null, fne.getMessage());
            askAgain=true;
        }
        }
        while (askAgain);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
