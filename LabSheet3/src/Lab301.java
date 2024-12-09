import java.util.*;


public class Lab301 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String text = "";
		String word;
		
		while(true) {
			System.out.print("Enter Word: ");
			word = scanner.next();
			
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Your terminate program...");
				break;
			}
			
			text += word + " ";
			
		}
		
		System.out.println(text.toUpperCase());
		
		
		
		
		scanner.close();

	}

}
