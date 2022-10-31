// Java program to find the factorial of the number inputed by the user also considring that the factorial of 0 is 1 and number should be positive

package factorial;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int fact = 1;
            if (n == 0) {
                System.out.println("Factorial of 0 is 1");
            } else if (n < 0) {
                System.out.println("Factorial of negative number is not possible");
            } else {
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + n + " is " + fact);
            }
        }
    }

}