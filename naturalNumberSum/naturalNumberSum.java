// Java program to print sum of natural numbers from 1 to n using recursion.

package naturalNumberSum;

import java.util.Scanner;

public class naturalNumberSum {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int sum = 0;
            if (n < 0) {
                System.out.println("Sum of natural numbers from 1 to " + n + " is " + sum);
            } else {
                for (int i = 1; i <= n; i++) {
                    sum = sum + i;
                }
                System.out.println("Sum of natural numbers from 1 to " + n + " is " + sum);
            }
        }
    }

}