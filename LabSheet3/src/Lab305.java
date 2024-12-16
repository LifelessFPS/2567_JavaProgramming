import java.util.Scanner;
public class Lab305 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String sentence;

	        System.out.print("Input a sentence : ");
	        sentence = scanner.nextLine();
	        
	        

	        
	        while (!sentence.endsWith(".")) {
	            System.out.print("The sentence must end with full stop point : ");
	            sentence = scanner.nextLine();
	        }


	       
	        sentence = sentence.trim();

	       
	        String word = "";

	        System.out.println();
	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);

	            
	            if (ch == ' ' || i == sentence.length() - 1) {
	                System.out.println(word);
	                word = ""; 
	            } else {
	                word += ch; 
	            }
		    }

	}

}
