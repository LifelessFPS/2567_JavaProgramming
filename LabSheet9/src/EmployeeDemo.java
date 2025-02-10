import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input emplyee id      : ");
		String empId = scan.next();
		scan.nextLine();
		System.out.print("Input emplyee name    : ");
		String empName = scan.nextLine();
		System.out.print("Input emplyee salary  : ");
		double empSalary = scan.nextDouble();
		System.out.print("Input emplyee sales   : ");
		double empSales = scan.nextDouble();
		
	    Sales emp9 = new Sales(empId, empName, empSalary, empSales);
	    System.out.println(emp9);
	    
	    System.out.println("Total salary "+(emp9.getSalary()+emp9.getCommission())+"Baht.");
	    
	    scan.close();

	}

}
