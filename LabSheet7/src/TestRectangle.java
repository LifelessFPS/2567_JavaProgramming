
public class TestRectangle {

	public static void main(String[] args) {
		//test constructor and toString
		//call default constructor
		Rectangle r1 = new Rectangle();
		//System.out.println(r1.toString());
		System.out.println(r1);//use toString method
		
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println(r2);
		System.out.println();
		
		//test setter and getter
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);
		System.out.println("length is " + r1.getLength());
		System.out.println("Width is "+ r1.getWidth());
		System.out.println();
		
		//test getArea() and getPerimeter()
		System.out.printf("area is %.2f%n",r1.getArea());
		System.out.printf("perimeter is %.2f",r1.getPerimeter());
		 
	

	}

}
