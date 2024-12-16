
import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String sentence;
        int countWords = 0;


        System.out.print("Input a sentence : ");
        sentence = scanner.nextLine();
        
        

        
        while (!sentence.endsWith(".")) {
            System.out.print("Input a sentence, again : ");
            sentence = scanner.nextLine();
        }

        
        int spaceCount = sentence.split(" ").length - 1;

        for(int i=0;i < sentence.length();i++) {
			countWords = sentence.split(" ").length;
			
			break;
		}
        
        
        

        
        System.out.printf("This sentence has " + spaceCount +" spacebar.");
        System.out.printf("\nThis sentence has "+ countWords +" word.");
		
		
		
		
		
		
		
		
	}

}


