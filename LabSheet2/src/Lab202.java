import java.util.Scanner;
public class Lab202 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int temp = Integer.MIN_VALUE;
		System.out.print("Input number : ");
		int num = scanner.nextInt();
		
		
		while (true) {
			
			if (temp>num) {
				System.out.print("\nBYE BYE");
				break;
				
			}
			temp = num;
			System.out.print("Input number : ");
			num = scanner.nextInt();
			
		}


	}

}
