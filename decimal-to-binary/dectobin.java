// Create a java program which can take a deciaml number as input and gives the equivalent binary number as output.


import java.util.Scanner;



public class dectobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        int[] bin = new int[100];
        int i = 0;
        while (n > 0) {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }
        System.out.print("The binary equivalent is: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
        sc.close();
    }
}