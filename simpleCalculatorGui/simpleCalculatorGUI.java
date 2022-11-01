// Program to create a simple calculator using java awt components and event handling

import java.awt.event.*;
import javax.swing.*;

public class simpleCalculatorGUI extends JFrame implements ActionListener {
    // Declaring the variables
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    // Constructor
    simpleCalculatorGUI() {
        // Creating the frame
        JFrame frame = new JFrame("GUI Based Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        // Creating the text field
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        frame.add(textField);

        // Creating the buttons
        button1 = new JButton("1");
        button1.setBounds(50, 100, 50, 50);
        frame.add(button1);

        button2 = new JButton("2");
        button2.setBounds(120, 100, 50, 50);
        frame.add(button2);

        button3 = new JButton("3");
        button3.setBounds(190, 100, 50, 50);
        frame.add(button3);

        button4 = new JButton("4");
        button4.setBounds(50, 170, 50, 50);
        frame.add(button4);

        button5 = new JButton("5");
        button5.setBounds(120, 170, 50, 50);
        frame.add(button5);

        button6 = new JButton("6");
        button6.setBounds(190, 170, 50, 50);
        frame.add(button6);

        button7 = new JButton("7");
        button7.setBounds(50, 240, 50, 50);
        frame.add(button7);

        button8 = new JButton("8");
        button8.setBounds(120, 240, 50, 50);
        frame.add(button8);

        button9 = new JButton("9");
        button9.setBounds(190, 240, 50, 50);
        frame.add(button9);

        button0 = new JButton("0");
        button0.setBounds(120, 310, 50, 50);
        frame.add(button0);

        buttonAdd = new JButton("+");
        buttonAdd.setBounds(260, 100, 50, 50);
        frame.add(buttonAdd);

        buttonSub = new JButton("-");
        buttonSub.setBounds(260, 170, 50, 50);
        frame.add(buttonSub);

        buttonMul = new JButton("*");
        buttonMul.setBounds(260, 240, 50, 50);
        frame.add(buttonMul);

        buttonDiv = new JButton("/");
        buttonDiv.setBounds(260, 310, 50, 50);
        frame.add(buttonDiv);

        buttonEqual = new JButton("=");
        buttonEqual.setBounds(190, 310, 50, 50);
        frame.add(buttonEqual);

        buttonClear = new JButton("C");
        buttonClear.setBounds(50, 310, 50, 50);
        frame.add(buttonClear);

        // Adding action listeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);

        // Setting the frame visible
        frame.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new simpleCalculatorGUI();
    }

    // Action performed method
    @Override

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == button1) {
            textField.setText(textField.getText().concat("1"));
        }
        if (source == button2) {
            textField.setText(textField.getText().concat("2"));
        }
        if (source == button3) {
            textField.setText(textField.getText().concat("3"));
        }
        if (source == button4) {
            textField.setText(textField.getText().concat("4"));
        }
        if (source == button5) {
            textField.setText(textField.getText().concat("5"));
        }
        if (source == button6) {
            textField.setText(textField.getText().concat("6"));
        }
        if (source == button7) {
            textField.setText(textField.getText().concat("7"));
        }
        if (source == button8) {
            textField.setText(textField.getText().concat("8"));
        }
        if (source == button9) {
            textField.setText(textField.getText().concat("9"));
        }
        if (source == button0) {
            textField.setText(textField.getText().concat("0"));
        }
        if (source == buttonAdd) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (source == buttonSub) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (source == buttonMul) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (source == buttonDiv) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (source == buttonEqual) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    result = 0;
            }
            textField.setText("" + result);
        }
        if (source == buttonClear) {
            textField.setText("");
        }
    }

}
