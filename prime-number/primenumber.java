// Java program which ask user to input any number and then it checks whether the number is prime or not  and gives the output accordingly.

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number to check whether it is prime or not");
            int num = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
    }
}