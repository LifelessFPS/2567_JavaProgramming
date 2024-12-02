import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		// Declare constants
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 final double BASE = 1000.0;
		 
		 
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 Scanner input = new Scanner(System.in);
		 while (true) {
			System.out.print("Enter gross sales for the saleperson(or -1 to end)");
			sales = input.nextInt();
			
			if(sales == SENTINEL) {
				break;
			}
			salary = BASE + (sales * COMMISSION_RATE);
			
			System.out.printf("The saleperson's salary is $%,.2f",salary);
			System.out.println();
		}
		 System.out.println("All salesperson's salaries have been complete");

	}

}
