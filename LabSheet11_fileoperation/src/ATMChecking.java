import java.util.*;
import java.io.*;
import java.text.DecimalFormat;


public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber, password);
		this.money = money;
	}
	
	boolean CheckBookBank() throws IOException{
		try(BufferedReader readFile = new BufferedReader(new FileReader("src//txtFile//ATMBookBank.txt"))){
			String temp ="";
			while ((temp = readFile.readLine()) != null) {
				String[] data = temp.split("\t");
				if(super.getId() != data[0]) {
					break;
					//System.out.print("Input wrong type, Enter account number : ");
				}
				else if(super.getPass() == data[1]) {
					break;
					//System.out.print("Enter password : ");
				}
				int balance = Integer.parseInt(data[2]);
				
				if(balance<this.money)
					break;
			}
			
		}
		return false;
	}
	
	
	void show() throws IOException{
		if(!CheckBookBank()) {
			System.out.print("Sorry, your id or password is wrong, or your amount not enough.");
			return;
		}
		DecimalFormat format = new DecimalFormat("#,###.00");
		int thousands = money/1000;
		int fiveHundreds = (money % 1000)/500;
		int hundreds = (money%500)/100;
		System.out.printf("Your Drawing for %s, get%n",format.format(money));
		System.out.printf("\t1000 = %d%n",thousands);
		System.out.printf("\t500  = %d%n",fiveHundreds);
		System.out.printf("\t100  = %d%n",hundreds);
		System.out.printf("Your balance is %s baht.%n",format.format(balance-money));
	}
	
	
	

	
	

}
