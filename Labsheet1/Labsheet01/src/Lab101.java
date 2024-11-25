import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab101 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//Input product name
		System.out.print("Input product name   : ");
		String productName = scan.nextLine();
		
		System.out.print("Input product unit   : ");
		int productUnit = scan.nextInt();
		
		System.out.print("Input price per unit : ");
		float productPrice = scan.nextFloat();
		
		float totalPriceProduct = productUnit* productPrice;
		System.out.println("--------------------------------------------------------");
		System.out.println("Total Price is "+ frm.format(totalPriceProduct) + " Baht.");
		System.out.println("--------------------------------------------------------");
		
		System.out.print("How many Discount (%) : ");
		double discount = scan.nextDouble();

	}

}
