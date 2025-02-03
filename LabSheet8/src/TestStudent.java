
import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		//กำหนดobjectรับข้อมมูลทาง console keyboard
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many student in classroom: ");
		int numberOfStudent = scan.nextInt();
		scan.nextLine();
		
		//ArrayObject step1
		Student[] students = new Student[numberOfStudent];
		//ArrayObject step2
		for(int i=0;i<students.length;i++) {
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT " + (i+1));
			line();
			System.out.println();
			
			//input name
			System.out.print("Input student name: ");
			/*String stdName = scan.nextLine();
			students[i].setName(stdName);*/
			students[i].setName(scan.nextLine());
			
			//output message and input score
			System.out.print("Input student score: ");
			students[i].setScore(scan.nextInt());
			scan.nextLine();
			/*int stdScore = scan.nextInt();
			scan.nextLine();
			students[i].setScore(stdScore);*/
			while(!students[i].checkScore()) {
				System.out.print("Input student score, again: ");
				students[i].setScore(scan.nextInt());
				scan.nextLine();
			}
		}
		System.out.println("\nLIST OF PASS STUDENT (>=50)");
		line();
		//using foreach
		for(Student student : students) {
			if(student.isPass()) {
				System.out.print("\n>> "+student.getName() + " (" + student.getScore() + ")");
			}
		}
		
		
		
		
		scan.close();

	}//end class
	
	public static String findGrade(int score) {
		if(score>=80&&score<=100) {
			return "A";
		}else if (score>=75&&score<=79) {
			return "B+";
		}else if (score>=70&&score<=74) {
			return "B";
		}else if (score>=65&&score<=69) {
			return "C+";
		}else if (score>=60&&score<=64) {
			return "C";
		}else if (score>=55&&score<=59) {
			return "D+";
		}else if (score>=50&&score<=54) {
			return "D";
		}else return "F";
	}
	
	
	public static void line(){
		for(int i = 1;i<40;i++) {
			System.out.print("-");
		}
	}

}
