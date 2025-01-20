
public class IncomeTaxCalculator {
	private double income;

    // Method to set the income
    public void setIncome(double _income) {
        income = _income;
    }

    // Method to calculate the tax
    public double calculateTax() {
        double tax = 0;
        if(income<150000) {
        	tax = 0;
        }else if (income > 150000 && income <= 300000) {
            tax += (income - 150000) * 0.05;
        } else if (income > 300000 && income <= 500000) {
            tax += (300000 - 150000) * 0.05;
            tax += (income - 300000) * 0.10; 
        } else if (income > 500000) {
            tax += (300000 - 150000) * 0.05;
            tax += (500000 - 300000) * 0.10; 
            tax += (income - 500000) * 0.20; 
        }

        return tax;
    }

    // Method to display tax details
    public void displayTaxDetails() {
        double tax = calculateTax();
        System.out.printf("Income: %.1f%n", income);
        System.out.printf("Tax: %.1f%n", tax);

    }
}
