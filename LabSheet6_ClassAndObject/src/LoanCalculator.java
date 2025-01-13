
public class LoanCalculator {
	private String productName;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String productName_, double productPrice, double productInterestRate, int productYears) {
		productName = productName_;
		price = productPrice;
		interestRate = productInterestRate;
		years = productYears;
	}
	
	public double calculateMonthlyPayment() {
		int month = years*12;
		double interestRatePerMonth = interestRate/100;
		
		
		interestRatePerMonth = interestRatePerMonth/12;
		
		double monthly = 1+interestRatePerMonth;
		double MathPower = Math.pow(monthly, month);
		
		return (price*interestRatePerMonth*MathPower)/(MathPower - 1);
		
	}
	
	
	public void displayLoanDetails() {
		System.out.println("Product: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Interest Rate: " + interestRate + "%");
		System.out.println("Loan Period: " + years + " years");
		System.out.println("Monthly Payment: " + calculateMonthlyPayment());
		
	}

}
