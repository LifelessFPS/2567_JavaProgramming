/*=================LAB602==================*/

public class TestStudent {

	public static void main(String[] args) {
		//Create to student object
		Student std1 = new Student();
		Student std2 = new Student();
		
		//set student detail
		std1.setStudentDetails("Intouch", new double[] {85.0,67.0,78.5});
		std2.setStudentDetails("Sukonlawat", new double[] {90.0,59.8});
		Line('=');
		//display student detail
		System.out.println("Student #1 Details:");
		std1.displayStudentDetails();
		
		Line('*');
		
		System.out.println("Student #2 Details:");
		std2.displayStudentDetails();
		Line('-');
		
	}
	
	public static void Line(char ch) {
		for(int i=1;i<60;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}
