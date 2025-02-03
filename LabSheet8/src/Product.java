public class Product {
	private String productId;
	private int productUnit;
	private double productPrice;
	
	void setId(String pid) {
		productId = pid;
	}
	String getId() {
		return this.productId;
	}
	void setUnit(int proUnit) {
		productUnit = proUnit;
	}
	int getUnit() {
		return this.productUnit;
	}
	void setPrice(double proPrice) {
		productPrice = proPrice;
	}
	double getPrice() {
		return this.productPrice;
	}
	double calculate() {
		return productUnit*productPrice;
	}

}
