import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product name:");
		System.out.print("Name: ");
		String productName = scanner.nextLine();
		System.out.print("Enter product price: ");
		double productPrice = scanner.nextDouble();
		
		System.out.print("Enter VAT rate (%): ");
		double productVAT = scanner.nextDouble();
		
		product.setProductDetails(productName, productPrice, productVAT);
		System.out.println();
		product.displayProductDetails();

	}

}
