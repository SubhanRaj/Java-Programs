// Java program to reverse a number inputed by the user and print the reversed number, also considering that the number should be positive.

package reverseNumber;

import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int rev = 0;
            if (n < 0) {
                System.out.println("Reverse of negative number is not possible");
            } else {
                while (n != 0) {
                    int rem = n % 10;
                    rev = rev * 10 + rem;
                    n = n / 10;
                }
                System.out.println("Reverse of the number is " + rev);
            }
        }
    }

}
