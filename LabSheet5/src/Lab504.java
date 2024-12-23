import java.util.*;

import java.text.DecimalFormat;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		DecimalFormat toTheFormat = new DecimalFormat("#.##");
	    double [] score = new double[5];
		
		for(int i = 0;i<score.length;i++) {
			System.out.print("Input score of student " + (i + 1) +" : ");
			score[i] = scanner.nextDouble();
			sum += score[i];
		}
		
		double average = sum/score.length;
		System.out.println();
		
		
		
		System.out.printf("Average of " + score.length + " student is " + toTheFormat.format(average));
		System.out.println();
		int i =0;
		for(double _score : score) {
			i++;
			
			if(_score > average) {
				System.out.printf("> Student %s (%.2f)%n" , i , _score);
			}
			
		}
		
		
		
	}
		

}
