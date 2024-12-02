import java.util.Scanner;

public class Lab102 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number of minutes   : ");
		Float minutes = scan.nextFloat();
		
		float dayMinutes = minutes/1440;
		float years = dayMinutes/365;
		
		System.out.print(minutes+"minutes is  approximately"+);

	}

}
