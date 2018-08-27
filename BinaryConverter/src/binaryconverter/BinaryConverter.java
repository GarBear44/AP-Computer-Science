package binaryconverter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter extends Binary{

    public static void main(String[] args) {
        
        //Buttons to Press
        Object[] options = {"Decimal to Binary", "Binary to Decimal", "Quit"};
        
        //Window Properties
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter your decimal or binary expression"));
        JTextField textField = new JTextField(10);
        panel.add(textField);
        
        int mode = JOptionPane.showOptionDialog(null, panel, "Binary and Decimal Number Calculator",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, null);
        
        if (mode == JOptionPane.YES_OPTION) {

            String input = textField.getText();
            binaryToDecimal(input);
            
        }
        System.out.println(JOptionPane.NO_OPTION);
    }
    
    static void binaryToDecimal (String input) {
        
        int binaryNumber = Integer.parseInt(input);
        int binaryLength = input.length();

        Binary binary = new Binary();

        int result = binary.binaryToDecimal(binaryNumber, binaryLength);

        JOptionPane.showMessageDialog(null, "Binary: " + input + "\n Decimal: " + result);
        
    }
    
}
