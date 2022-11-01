// a termianl based simple calculator using switch case, if-else and loops in java

package simpleCalculatorTerminal;

import java.util.Scanner;

public class simpleCalculatorTerminal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double num1, num2, result = 0;
            char operator;
            System.out.println("Enter the first number: ");
            num1 = sc.nextDouble();
            System.out.println("Enter the second number: ");
            num2 = sc.nextDouble();
            System.out.println("Enter the operator: ");
            operator = sc.next().charAt(0);
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
                    System.out.println("Invalid operator");
                    break;
            }
            System.out.println("The result is: " + result);
            sc.close();
        }
    }
}
