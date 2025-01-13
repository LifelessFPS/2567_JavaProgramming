import java.util.*;

import java.text.DecimalFormat;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        double total = 0;

        // Input scores for 5 students
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Input score of student " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            total += scores[i]; // Accumulate total score
        }

        // Calculate the average score
        double average = total / scores.length;

        System.out.println();
        System.out.printf("Average of 5 students is %.2f%n", average);

        // Display scores above the average
       
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                System.out.printf("> Student %d (%.2f)%n", i + 1, scores[i]);
            }
        }
    }
		
		
		
}
		


