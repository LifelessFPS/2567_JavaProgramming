import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName;//inputบรรทัดที่เราป้อน
		String firstName;//ชื่อแรก,extract
		
		System.out.println("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' ');//หาการเว้นวรรคจาก full name
		firstName = fullName.substring(0,space);
		
		System.out.println(abbreviatName(fullName) + firstName);
		
		
		
		
		input.close();

	}//end main method
	
	public static String abbreviatName(String fullName) {
		String initialLetter = "";
		for(int i = 0;i<fullName.length();i++) {
			if(fullName.charAt(i) == ' ') {
				initialLetter = (initialLetter + fullName.charAt(i+1)).toUpperCase();
				initialLetter = initialLetter+".";
			}
		}
		
		
		return initialLetter;
	}

}
