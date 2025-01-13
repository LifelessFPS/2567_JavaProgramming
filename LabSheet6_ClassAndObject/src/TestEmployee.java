public class TestEmployee {

	public static void main(String[] args) {
		//Create to employee object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//set employee detail
		emp1.setEmployeeDetails("John",45,20.0);
		emp2.setEmployeeDetails("Jane",35,25.0);
		
		//display
		System.out.println("Employee 1 Deatail");
		emp1.displayEmployeeDetail();
		
		System.out.println("Employee 2 Deatail");
		emp2.displayEmployeeDetail();

	}

}
