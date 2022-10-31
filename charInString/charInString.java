// Java proram to count the total number of characters in a string.

package charInString;

import java.util.Scanner;

public class charInString {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = input.nextLine();
            System.out.println("Total number of characters in the string: " + str.length());
        }
    }
}
