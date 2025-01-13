import javax.swing.*;
public class Lab506 {

	public static void main(String[] args) {
		String[] greetings = {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};

        // Prepare the message to be displayed
        StringBuilder message = new StringBuilder("The greeting words in English:\n");
        for (String greeting : greetings) {
            message.append("- ").append(greeting).append("\n");
        }

        // Display the message in a dialog box
        JOptionPane.showMessageDialog(null, message.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
    }

}


