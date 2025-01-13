import java.util.*;
public class TestEmployeeInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//input for first Employee
		System.out.println("Enter detail for Employee 1:");
		System.out.print("Name: ");
		String empName1 = scanner.nextLine();
		System.out.print("Hours Worked: ");
		int empHoursWorked1 = scanner.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate1 = scanner.nextDouble();
		
		//set employee detail
		emp1.setEmployeeDetails(empName1, empHoursWorked1, empHourlyRate1);
		
		//display
		System.out.println("\nEmployee 1 Detail");
		emp1.displayEmployeeDetail();
		
		scanner.nextLine();//consume leftover new line
		
		//Input for second employee
		System.out.println("\nEnter detail for Employee 2:");
		System.out.print("Name: ");
		String empName2 = scanner.nextLine();
		System.out.print("Hours Worked: ");
		int empHoursWorked2 = scanner.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate2 = scanner.nextDouble();
		
		emp2.setEmployeeDetails(empName2, empHoursWorked2, empHourlyRate2);
		
		System.out.println("Employee 2 Detail");
		emp2.displayEmployeeDetail();

	}

}
