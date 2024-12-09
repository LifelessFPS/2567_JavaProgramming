import javax.swing.JOptionPane;
public class Lab104 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application");
        String employeeName = JOptionPane.showInputDialog("Enter employee name:");
        float hoursWorkedStr = Float.parseFloat(JOptionPane.showInputDialog("Enter total hours worked for this employee:"));
        float hourlyWageStr = Float.parseFloat(JOptionPane.showInputDialog("Enter hourly wage for this employee:"));

        float earning = hoursWorkedStr*hourlyWageStr;
        float taxRate = 0.15f;
        float tax = earning*taxRate;

        float netEarn = earning-tax;

        String output = String.format(
            "Employee name: %s\n" +
            "Hours worked: %.1f\n" +
            "Hourly wage: $%.2f\n" +
            "Gross earnings: $%.2f\n" +
            "Tax rate: %.2f\n" +
            "Tax: $%.2f\n" +
            "Net earnings: $%.2f",
            employeeName, hoursWorkedStr, hourlyWageStr, earning, taxRate, tax, netEarn
        );
        JOptionPane.showMessageDialog(null, output);

	}

}
