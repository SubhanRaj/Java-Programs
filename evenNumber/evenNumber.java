// Java program to print even numbers upto n

package evenNumber;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            System.out.println("Even numbers upto " + n + " are: ");
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

