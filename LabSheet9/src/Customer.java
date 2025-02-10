
public class Customer {
	private int cid;
	private String name;
	private int discount;
	
	Customer(int cid,String name,int discount) {
		this.cid = cid;
		this.name = name;
		this.discount = discount;
	}
	
	int getCusID() {
		return this.cid;
	}
	String getCusName() {
		return this.name;
	}
	int getDiscount() {
		return this.discount;
	}
	void setDiscount(int discount) {
		this.discount=discount;
	}
	public String toString() {
		return getCusName()+"("+getCusID()+")("+getDiscount()+"%)";
	}

}
