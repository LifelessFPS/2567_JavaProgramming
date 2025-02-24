
public class ATMData {
	private String accountNumber;
	private String password;
	
	ATMData(String accountNumber,String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}
	
	String getId() {
		return this.accountNumber;
	}
	
	String getPass() {
		return this.password;
	}

	
}
