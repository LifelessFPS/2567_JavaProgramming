import java.util.Scanner;
public class Lab307 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    
        System.out.print("Text: ");
        String input = scanner.nextLine().toLowerCase();
        
        String noSpace = input.replaceAll(" ", "").toLowerCase();
        
         int left = 0;
        int right = noSpace.length() - 1;
        boolean palindrome = true;
        
        while (left < right) {
            if (noSpace.charAt(left) != noSpace.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
            
            
        }
        if (palindrome) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

        scanner.close();

	}

}
