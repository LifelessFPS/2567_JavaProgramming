import java.util.*;
public class JavaExample1_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name(using next): ");
		String firstName = input.next();
		input.nextLine();
		
		System.out.print("Enter your lastname name(using nextline): ");
		String lastName = input.nextLine();
		
		System.out.println("\n------Output------");
		System.out.println("First name : "+ firstName);
		System.out.println("Last  name : "+ lastName);
		
		
		
		
		
		
		
		
		
		input.close();
		
	}

}
