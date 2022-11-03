// Java program which can take any number and outout it as words (e.g. 1234 = one thousand two hundred thirty four)

package numToWord;

import java.util.Scanner;

public class numToWord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            System.out.println("The number " + n + " in words is: ");
            int num = n;
            int count = 0;
            while (num > 0) {
                num = num / 10;
                count++;
            }
            int[] arr = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = n % 10;
                n = n / 10;
            }
            for (int i = count - 1; i >= 0; i--) {
                switch (arr[i]) {
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
                case 0:
                    System.out.print("zero ");
                    break;
                }
                if (i == 3) {
                    System.out.print("thousand ");
                } else if (i == 2) {
                    System.out.print("hundred ");
                }
            }
        }
    }
}

