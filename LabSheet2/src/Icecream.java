import javax.swing.JOptionPane;
public class Icecream {

	public static void main(String[] args) {
		
		//
		final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;

        int choice;
        int price = 0;
        String flavor = "";

        
        while (true) {
            String input = JOptionPane.showInputDialog(
                    "[1] Vanilla Flavor 10 B.\n[2] Chocolate Flavor 15 B.\nPlease number to choose flavor:");
            try {
                choice = Integer.parseInt(input); // แปลงตัวเลขที่ผู้ใช้ใส่
                if (choice == 1 || choice == 2) {
                    flavor = (choice == 1) ? "Vanilla" : "Chocolate";
                    price = (choice == 1) ? VANILLA : CHOCOLATE;
                    break; 
                } else {
                    
                    JOptionPane.showMessageDialog(null, "ERROR: Wrong choice! Try again...");
                }
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "ERROR: Please enter a valid number!");
            }
        }

        
        int toppingChoice = JOptionPane.showConfirmDialog(
                null, "Do you want to add topping?", "Topping", JOptionPane.YES_NO_OPTION);

        
        if (toppingChoice == JOptionPane.YES_OPTION) {
            price += TOPPING; 
            JOptionPane.showMessageDialog(null, "You choose " + flavor + " Flavor\n"
                    + "With topping\n"
                    + "Total price = " + price + " baht.");
        } else {
            JOptionPane.showMessageDialog(null, "You choose " + flavor + " Flavor\n"
                    + "No topping\n"
                    + "Total price = " + price + " baht.");
        }

	}

}
