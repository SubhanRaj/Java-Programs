// Java program to take marks of 6 subject like subject1, subject2 etc using for loop then calculate the average, total marks, and percentage, giving each subject has 100 marks max.
package subjectAverage;

import java.util.Scanner;

public class subjectAvg {

    public static void main(String[] args) {
        try (
                // TODO Auto-generated method stub
                Scanner sc = new Scanner(System.in)) {
            int subject1, subject2, subject3, subject4, subject5, subject6;
            int totalMarks;
            float average, percentage;

            System.out.println("Enter marks of subject 1: ");
            subject1 = sc.nextInt();
            System.out.println("Enter marks of subject 2: ");
            subject2 = sc.nextInt();
            System.out.println("Enter marks of subject 3: ");
            subject3 = sc.nextInt();
            System.out.println("Enter marks of subject 4: ");
            subject4 = sc.nextInt();
            System.out.println("Enter marks of subject 5: ");
            subject5 = sc.nextInt();
            System.out.println("Enter marks of subject 6: ");
            subject6 = sc.nextInt();

            totalMarks = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
            average = totalMarks / 6;
            percentage = (totalMarks / 600) * 100;

            System.out.println("Total marks: " + totalMarks);
            System.out.println("Average: " + average);
            System.out.println("Percentage: " + percentage);
        }

    }

}
