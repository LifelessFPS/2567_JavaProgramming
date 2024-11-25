import javax.swing.*;

public class JavaExample2 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		
		String productUnitstr = JOptionPane.showInputDialog("Input product Unit : ");
		int productUnit = Integer.parseInt(productUnitstr);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit : "));
		
		double totalPrice = productPrice * productUnit;
		
		String frmTotalPrice = String.format("%,.2f",totalPrice);
		
		JOptionPane.showMessageDialog(null, "Total Price is " + totalPrice +"baht.");
		
		double vatPrice = totalPrice + (totalPrice * 7/100);
		String frmvatPrice = String.format("%,.2f",vatPrice);
		JOptionPane.showMessageDialog(null, "Add Vat 7%  is " + vatPrice +"baht.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
