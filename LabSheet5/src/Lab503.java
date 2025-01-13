import java.util.Scanner;
public class Lab503 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[7];
	        int countOdd = 0;
	        StringBuilder oddNumbers = new StringBuilder();

	        // Input 7 numbers
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Input number " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        // Use foreach loop to count and collect odd numbers
	        for (int num : numbers) {
	            if (num % 2 != 0) { // Check if the number is odd
	                countOdd++;
	                oddNumbers.append(num).append(" ");
	            }
	        }

	        System.out.println();
	        System.out.println("There are " + countOdd + " odd numbers.");
	        System.out.println("List of odd numbers: " + oddNumbers.toString().trim());
	    }

}


