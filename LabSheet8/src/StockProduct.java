import java.util.Scanner;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4];
		
		for(int i = 0;i<productList.length;i++) {
			productList[i] = new Product();
			System.out.print("Input product Id     : ");
			productList[i].setId(scan.nextLine());
			
			
			System.out.print("Input product Unit   : ");
			productList[i].setUnit(scan.nextInt());
			scan.nextLine();
			
			System.out.print("Input product Price  : ");
			productList[i].setPrice(scan.nextDouble());
			scan.nextLine();
			System.out.println();
			while(productList[i].getPrice()<=0) {
				System.out.print("Input product price, again: ");
				productList[i].setPrice(scan.nextDouble());
				scan.nextLine();
			}
			
			
		}
		line();
		double total = 0;
		for(Product _Product : productList) {
			
			System.out.printf("\nProduct ID : %s, Total price = %,.2f baht." ,_Product.getId(),_Product.calculate());
			total += _Product.calculate();
		}
		line();
		System.out.printf("\nTotal price of all products is %,.2f baht." , total);
		scan.close();

	}
	
	static void line() {
		for(int i =0;i<40;i++) {
			System.out.print("-");
		}
	}

}
