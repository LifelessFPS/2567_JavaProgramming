import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		int[] numbers = new int[5];

        // Input 5 integers using dialog boxes
        for (int i = 0; i < numbers.length; i++) {
            String input = JOptionPane.showInputDialog(null, 
                "Input number " + (i + 1) + ":", 
                "Input", 
                JOptionPane.QUESTION_MESSAGE);
            numbers[i] = Integer.parseInt(input);
        }

        // Call the methods to display even and odd numbers
        showEven(numbers);
        showOdd(numbers);

	}
	
	public static void showEven(int[] nums) {
        StringBuilder evenNumbers = new StringBuilder("List of even numbers:\n");
        boolean hasEven = false;

        for (int num : nums) {
            if (num % 2 == 0) {
                evenNumbers.append(num).append(" ");
                hasEven = true;
            }
        }

        // If there are no even numbers
        if (!hasEven) {
            evenNumbers.append("None");
        }

        // Show the message in a dialog box
        JOptionPane.showMessageDialog(null, 
            evenNumbers.toString(), 
            "Message", 
            JOptionPane.INFORMATION_MESSAGE);
    }
	
	public static void showOdd(int[] nums) {
        StringBuilder oddNumbers = new StringBuilder("List of odd numbers:\n");
        boolean hasOdd = false;

        for (int num : nums) {
            if (num % 2 != 0) {
                oddNumbers.append(num).append(" ");
                hasOdd = true;
            }
        }

        // If there are no odd numbers
        if (!hasOdd) {
            oddNumbers.append("None");
        }

        // Show the message in a dialog box
        JOptionPane.showMessageDialog(null, 
            oddNumbers.toString(), 
            "Message", 
            JOptionPane.INFORMATION_MESSAGE);
    }

}
