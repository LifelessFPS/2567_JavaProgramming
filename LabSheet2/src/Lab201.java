import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET =299;
		double discount;
		int isMember;
		DecimalFormat dcm = new DecimalFormat("#,###.00");
		
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill? "));
		
		double totalPrice = numberofCustomer * BUFFET;
		
		do {
		 isMember = JOptionPane.showConfirmDialog(null, "Total Price is " + dcm.format(totalPrice) + "baht." + "\nDo you have member card?");
		} while (isMember == 2);
		
		
		if (isMember == 0) //if isMember == JOptionpane.YES_OPTION
			{
			discount = totalPrice*0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + dcm.format(discount) + "baht.");
		}
		else if(isMember==1) {
		
		JOptionPane.showMessageDialog(null, "Amount to be paid is " + dcm.format(totalPrice) + "baht.");
		}
		
	}

}
