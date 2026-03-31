package StudentGradingSystem;

import java.util.*;

public class MP1_StudentsGradeSystem {
    // Students Grade System
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // name as input
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        // Taking marks as input
        System.out.print("Enter your marks of English: ");
        int eng = sc.nextInt();

        System.out.print("Enter your marks of Hindi: ");
        int hin = sc.nextInt();

        System.out.print("Enter your marks of Maths: ");
        int mat = sc.nextInt();

        System.out.print("Enter your marks of Science: ");
        int sci = sc.nextInt();

        System.out.print("Enter your marks of Social Science: ");
        int ss = sc.nextInt();

        // Calculating percentage
        int sum = eng + hin + mat + sci + ss;
        int percentage = (sum * 100) / 500;

        // Display result
        System.out.println("\n----- Result Card -----");
        System.out.println("Name       : " + name);
        System.out.println("Total Marks: " + sum + "/500");
        System.out.println("Percentage : " + percentage + "%");

        // grading
        if (percentage >= 91 && percentage <= 100) {
            System.out.println("Grade      : A+");
        } else if (percentage >= 81) {
            System.out.println("Grade      : A");
        } else if (percentage >= 71) {
            System.out.println("Grade      : B");
        } else if (percentage >= 61) {
            System.out.println("Grade      : C");
        } else if (percentage >= 41) {
            System.out.println("Grade      : D");
        } else if (percentage >= 0) {
            System.out.println("Grade      : F");
        } else {
            System.out.println("Invalid Percentage");
        }
    }
}
