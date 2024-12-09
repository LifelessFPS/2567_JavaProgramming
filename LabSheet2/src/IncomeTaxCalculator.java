import java.util.Scanner;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K = 0.1; // 10%
        final double TAX_RATE_ABOVE_40K = 0.2; // 20%
        final double TAX_RATE_ABOVE_60K = 0.3; // 30%
        final int INCOME_THRESHOLD_20K = 20000;
        final int INCOME_THRESHOLD_40K = 40000;
        final int INCOME_THRESHOLD_60K = 60000;

        int taxableIncome;
        double taxPayable;

      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the taxable income: $");
        taxableIncome = scanner.nextInt();

       
        if (taxableIncome <= INCOME_THRESHOLD_20K) { // [0, 20000]
            taxPayable = 0;
        } else if (taxableIncome <= INCOME_THRESHOLD_40K) { // [20001, 40000]
            taxPayable = (taxableIncome - INCOME_THRESHOLD_20K) * TAX_RATE_ABOVE_20K;
        } else if (taxableIncome <= INCOME_THRESHOLD_60K) { // [40001, 60000]
            taxPayable = (20000 * TAX_RATE_ABOVE_20K) +
                         (taxableIncome - INCOME_THRESHOLD_40K) * TAX_RATE_ABOVE_40K;
        } else { // [60001, ]
            taxPayable = (20000 * TAX_RATE_ABOVE_20K) +
                         (20000 * TAX_RATE_ABOVE_40K) +
                         (taxableIncome - INCOME_THRESHOLD_60K) * TAX_RATE_ABOVE_60K;
        }

        
        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);

        scanner.close();

	}

}
