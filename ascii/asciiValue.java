/* Java program which first ask user to weather they want to find ASCII value of a character, number, special symbol, alphabet, or an entire string.
    Then use switch case to call the appropriate method to find the ASCII value of the input depending on the user's choice, and keep asking for user choice until user wants to exit. */

package ascii;

import java.util.Scanner;

public class asciiValue {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println(" 1. ASCII value of a character");
                System.out.println(" 2. ASCII value of a number");
                System.out.println(" 3. ASCII value of a special symbol");
                System.out.println(" 4. ASCII value of an alphabet");
                System.out.println(" 5. ASCII value of an entire string");
                System.out.println(" 6. Exit");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter a character: ");
                        char ch = input.next().charAt(0);
                        System.out.println("ASCII value of " + ch + " is " + (int) ch);
                        break;
                    case 2:
                        System.out.print("Enter a number: ");
                        int num = input.nextInt();
                        System.out.println("ASCII value of " + num + " is " + (char) num);
                        break;
                    case 3:
                        System.out.print("Enter a special symbol: ");
                        char sym = input.next().charAt(0);
                        System.out.println("ASCII value of " + sym + " is " + (int) sym);
                        break;
                    case 4:
                        System.out.print("Enter an alphabet: ");
                        char alpha = input.next().charAt(0);
                        System.out.println("ASCII value of " + alpha + " is " + (int) alpha);
                        break;
                    case 5:
                        System.out.print("Enter a string: ");
                        String str = input.next();
                        for (int i = 0; i < str.length(); i++) {
                            System.out.println("ASCII value of " + str.charAt(i) + " is " + (int) str.charAt(i));
                        }
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 6);
        }
    }
}
