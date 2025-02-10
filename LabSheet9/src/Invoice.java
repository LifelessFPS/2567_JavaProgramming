
public class Invoice {
	private int invid;
	private Customer customer;
	private double amount;
	
	Invoice(int invid,Customer customer,double amount) {
		this.invid = invid;
		this.customer = customer;
		this.amount = amount;
	}
	//InvoiceId
	int getInvId() {
		return this.invid;
	}
	//get set amount
	double getAmount() {
		return this.amount;
	}
	void setAmount(double amount) {
		this.amount = amount;
	}
	//get set customer
	void setCustomer(Customer customer) {
		this.customer = customer;
	}
	Customer getCustomer() {
		return this.customer;//call toString method from customer class
	}
	
	
	int getCustomerID() {
		return getCustomer().getCusID();
	}
	String getcustomerName() {
		return getCustomer().getCusName();
	}
	int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	double getAmountAfterDiscount() {
		return getAmount() - (getAmount() * getCustomerDiscount()/100);
	}
	public String toString() {
		return "Invoice[id="+getInvId()+",customer="+customer+"),amount="+getAmountAfterDiscount()+"]";
	}

}
