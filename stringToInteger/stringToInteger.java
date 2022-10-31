// Java program to convert the input string to integer using ASCII values.

package stringToInteger;

import java.util.Scanner;

public class stringToInteger {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = input.nextLine();
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                num = num * 10 + (str.charAt(i) - '0');
            }
            System.out.println("The integer value of the string is: " + num);
        }
    }
}