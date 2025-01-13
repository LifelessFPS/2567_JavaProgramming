import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		int[] numbers = {78, 36, 58, 41, 25, 92, 75};
        Scanner scanner = new Scanner(System.in);

        int index = -1; // Variable to store the user's input index
        boolean firstAttempt = true; // To track whether it's the first prompt or not

        while (true) {
            if (firstAttempt) {
                System.out.print("Input index of array: ");
                firstAttempt = false;
            } else {
                System.out.print("Input index of array, again: ");
            }

            index = scanner.nextInt();

            // Check if the index is valid
            if (index < 0 || index >= numbers.length) {
                
            } else {
                // Valid index; process the input
                System.out.println("Value in current index is: " + numbers[index]);

                if (index == numbers.length - 1) {
                    // If it's the last index, notify the user
                    System.out.println("Sorry, " + index + " is the last index in the array.");
                } else {
                    // Otherwise, display the next value
                    System.out.println("Value in next index is: " + numbers[index + 1]);
                }
                break;
            }
        }

        scanner.close();
    }
}


