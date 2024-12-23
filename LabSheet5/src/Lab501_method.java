import javax.swing.JOptionPane;

public class Lab501_method {
	
	static int[] idProduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] priceProduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	static double itemPrice = 0;//get price
	static boolean validItem = false;//check compare


		public static void main(String[] args) {
		inputItem();

		}
		
		public static void inputItem() {
			int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
			
			if(checkItem(itemOrder)) {
				JOptionPane.showMessageDialog(null, "Item " + itemOrder + " is " + itemPrice);
				System.out.print("Item " + itemOrder + " is " + itemPrice);
				
			}else {
				JOptionPane.showMessageDialog(null, "Invalid item");
				System.out.print("Invalid item");
			}
			
		}//end of input item
		
		public static boolean checkItem(int item) {
			for(int i = 0 ;i<idProduct.length;i++) {
				if(item == idProduct[i]) {
					itemPrice = priceProduct[i];
					validItem = true;
				}
			}
			
			return validItem;
		}
		

	}


