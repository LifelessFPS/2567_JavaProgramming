import java.util.*;
public class Lab404 {
	
	public static void main(String[] args) {
		inputStudent();

	}
	
	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		
		String studentId = "";
		String subjectId = "";
		System.out.print("Enter student ID: ");
		studentId = scanner.nextLine();
		System.out.print("Enter subject ID: ");
		subjectId = scanner.nextLine();
		
		
		while(isLength(studentId, subjectId)) {
			System.out.print("Enter student ID: ");
			studentId = scanner.nextLine();
			System.out.print("Enter subject ID: ");
			subjectId = scanner.nextLine();
			isLength(studentId,subjectId);
		}
		
		System.out.print("Student id: " + studentId +" ");
		
		displayData(isITStudent(studentId),isITSubject(subjectId));
		
	}
	
	public static boolean isLength(String studentId,String subjectId) {
		if(studentId.length() == 10 && subjectId.length() == 7) {
			return false;
		}
		return true;
	}
	
	public static boolean isITStudent(String studentId) {
		return studentId.contains("211311");
	}
	
	
	public static boolean isITSubject(String subjectId) {
		
		return (subjectId.charAt(0) == '2' && subjectId.charAt(1) == '1'&& subjectId.charAt(4) == '1');
	}
	
	public static void displayData(boolean studentId,boolean subjectId) {
		if(studentId) {
			System.out.println("1st year student in IT");
		}else {
			System.out.println("is not 1st year student in IT");
		}
		if(subjectId) {
			System.out.println("Enroll in courses for Year 1");
		}else {
			System.out.println("not enroll in courses for Year 1");
		}

	}

}
