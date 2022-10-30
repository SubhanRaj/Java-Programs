// Java program to take a character as input and check whether it is a vowel or a constant and display the result accordingly.

package vowelOrConstant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class vowelOrConstant extends JFrame implements ActionListener {
    // Declaring the variables
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JButton button;
    private JLabel label;

    // Constructor
    vowelOrConstant() {
        // Creating the frame
        JFrame frame = new JFrame("Vowel or Constant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        // Creating the text field
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        frame.add(textField);

        // Creating the button
        button = new JButton("Check");
        button.setBounds(50, 100, 300, 50);
        frame.add(button);

        // Creating the label
        label = new JLabel();
        label.setBounds(50, 175, 300, 50);
        frame.add(label);

        // Adding the action listener
        button.addActionListener(this);

        // Setting the frame visible
        frame.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new vowelOrConstant();
    }

    // Action listener
    @Override
    public void actionPerformed(ActionEvent e) {
        // Getting the input
        String input = textField.getText();

        // Checking if the input is a vowel or a constant
        if (input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")) {
            label.setText("The input is a vowel.");
        } else {
            label.setText("The input is a constant.");
        }
    }
}


