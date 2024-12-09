import javax.swing.JOptionPane;
public class MusicWorldApp {

	public static void main(String[] args) {
		String cdId = JOptionPane.showInputDialog("Enter CD ID:");
        String cdTitle = JOptionPane.showInputDialog("Enter CD Title:");
        String cdPriceStr = JOptionPane.showInputDialog("Enter CD Price:");
        String cdQuantityStr = JOptionPane.showInputDialog("Enter CD Quantity:");

        double cdPrice = Double.parseDouble(cdPriceStr);
        int cdQuantity = Integer.parseInt(cdQuantityStr);

        double subTotal = cdPrice * cdQuantity;
        double taxRate = 6.25;
        double total = subTotal + (subTotal * (taxRate/100));

        JOptionPane.showMessageDialog(null, "Summary of the transaction:\n" +
                "CD ID: " + cdId + "\n" +
                "CD Title: " + cdTitle + "\n" +
                "CD Unit Price: $" + cdPrice + "\n" +
                "CD Quantity: " + cdQuantity + "\n\n" +
                "Subtotal: $" + subTotal + "\n" +
                "Tax rate: "+taxRate+"%\n" +
                "Total: $" + total + "\n" +
                "\nEnd of this program");

	}

}
