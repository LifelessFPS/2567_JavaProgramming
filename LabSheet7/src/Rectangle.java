
public class Rectangle {
	// private attribute
	private float length;//= 1.0f;
	private float width;//1.0f;
	
	//default
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	} 
	//parameterized
	public Rectangle(float length,float width) {
		this.length = length;
		this.width = width;
	}
	
	//getter and setter method
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	//calculate area
	public double getArea() {
		return this.length * this.width;
	}
	
	//calculate Perimeter
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	//toString(); method
	public String toString() {
		return "Rectangle[length= " + this.length + ",width= " + this.width + "]";
	}
	
	

}
