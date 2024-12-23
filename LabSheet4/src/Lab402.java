import javax.swing.*;
public class Lab402 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Input year :", "Input", JOptionPane.QUESTION_MESSAGE);
            
        
        int year = Integer.parseInt(input);
        
        if (!checkYear(year)) {
            JOptionPane.showMessageDialog(null, "Invalid year. Please enter a year between 1000 and 3000.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isLeapYear(year)) {
            JOptionPane.showMessageDialog(null, year + " is a leap year.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, year + " is not a leap year.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }

	}
	
	public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkYear(int year) {
        return year >= 1000 && year <= 3000;
    }

}
