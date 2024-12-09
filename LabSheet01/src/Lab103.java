import javax.swing.*;
public class Lab103 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Input Time Parking (minute):");
        int totalMinutes = Integer.parseInt(input);

        
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        float hourPrice = hours * 50;
        float minutePrice = minutes * .25f;
        float totalPrice = hourPrice + minutePrice;


        
        String message = String.format(
            "You parking %d Hour %d Minute.\nAmount to be paid is %.1f baht.", 
            hours, minutes, totalPrice
        );
        
        
        JOptionPane.showMessageDialog(null, message);

	}

}
