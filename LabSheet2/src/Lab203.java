import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Lab203 {

	public static void main(String[] args) {
		float weight = Float.parseFloat(JOptionPane.showInputDialog(null, "Input Weight:"));
		float heightCM = Float.parseFloat(JOptionPane.showInputDialog(null, "Input Height:"));
		float heightMeter = heightCM/100;
		float heightMeter_2 = heightMeter*heightMeter;
		float BMI = weight/heightMeter_2;
		DecimalFormat dcm = new DecimalFormat("##.#");
		
		if (BMI < 18.5) {
			JOptionPane.showMessageDialog(null, "BMI = " + dcm.format(BMI) + "\nYou're Underweight","BMI",JOptionPane.WARNING_MESSAGE);
		}else if (BMI >=18.5 && BMI <=24.9) {
			JOptionPane.showMessageDialog(null, "BMI = " + dcm.format(BMI) + "\nYou're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}else if (BMI>25.0&&BMI<=29.9) {
			JOptionPane.showMessageDialog(null, "BMI = " + dcm.format(BMI) + "\nYou're Over-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "BMI = " + dcm.format(BMI) + "\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		}
		
	}

}
