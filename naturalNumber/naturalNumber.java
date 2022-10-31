// Java program to print all natural numbers from 1 to n using recursion.

package naturalNumber;

import java.util.Scanner;

public class naturalNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            printNaturalNumbers(n);
        }
    }

    private static void printNaturalNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNaturalNumbers(n - 1);
        System.out.println(n);
    }
}