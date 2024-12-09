import java.util.Scanner;
public class Lab102 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input the number of minutes: ");
        int minutes = scanner.nextInt();

        
        int minutesInYear = 60 * 24 * 365; 
        int years = minutes / minutesInYear; 
        int remainingMinutes = minutes % minutesInYear; 
        int minutesInDay = 60 * 24; 
        int days = remainingMinutes / minutesInDay; 

        
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

	}

}
