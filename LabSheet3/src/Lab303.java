
import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Input a sentence : ");
		String sentence = scanner.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scanner.nextLine();
			
			}
		
		
		System.out.println();
		
		for(int i =0;i< sentence.length();i++) {
			int space = sentence.split("").length;
			System.out.println("This sentence has " + space + " spacebars.");
			break;
		}
		
		
		
		for(int i=0;i < sentence.length();i++) {
			int countWords = sentence.split(" ").length;
			System.out.println("This sentence has " + countWords + " word.");
			break;
		}
		
		
		
		
		
		
		
		
	}

}


