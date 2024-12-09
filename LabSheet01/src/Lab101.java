import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		DecimalFormat frmDiscount = new DecimalFormat("0");
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
		float discount = scan.nextFloat();
		
		System.out.println("--------------------------------------------------------");
		
		
		float discountEx = totalPriceProduct * (discount/100);
		float totalDiscount = totalPriceProduct - discountEx;
		
		
		System.out.println("Discount from "+frmDiscount.format(discount)+"%\t\t"+ frm.format(discountEx)+" baht.");
		
		System.out.println("Amount to be paid \t\t" +frm.format(totalDiscount)+" baht.");


	}

}
