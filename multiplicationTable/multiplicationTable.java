// Java progam to take a number from the user as input and display the multiplication table of that number upto 'n' terms in the terminal.

package multiplicationTable;

import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        for (int i = 1; i <= terms; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        sc.close();
    }
}

