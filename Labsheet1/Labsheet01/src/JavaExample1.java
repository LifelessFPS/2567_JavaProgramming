import java.util.*;
import java.text.*;
public class JavaExample1 {
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
		
		System.out.println();
		System.out.println("Product name is "+ productName);
		float totalPriceProduct = productUnit* productPrice;
		System.out.println("Total Price is "+ frm.format(totalPriceProduct) + " Baht.");
		
		
	    float totalVat = totalPriceProduct + (totalPriceProduct * 7/100);
	    System.out.println("Add VAT 7%  is "+ frm.format(totalVat) + " Baht.");
	    
	    
	    System.out.println("**************using printf and String format**************");
	    System.out.printf("Product name is: %s",productName);
	    System.out.printf("\nTotal Price  is: %,.2f",totalPriceProduct);
	    System.out.printf("\nAdd VAT 7%%   is: %s",String.format("%,.2f",totalVat));
	    
	    
	    
	    
	    
		scan.close();

	}

}
