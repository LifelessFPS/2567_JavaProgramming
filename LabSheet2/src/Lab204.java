import java.util.Scanner;

public class Lab204 {

	public static void main(String[] args) {
		int X, Y;
        int sum = 0;

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of X : ");
        X = scanner.nextInt();
        System.out.print("Enter the value of Y : ");
        Y = scanner.nextInt();
        
        while(Y<=X){
            System.out.print("Enter the value of Y, again : ");
            Y = scanner.nextInt();
        }
            
        

        System.out.println();
        for (int i = X; i <= Y; i++) {
            int res = sum;
            sum += i;
            System.out.println(res + " + " + i + " = " + sum);
            
        }
        scanner.close();

	}

}
