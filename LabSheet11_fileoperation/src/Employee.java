
public class Employee {
	private String dept;
	void setDept(String dept) {
		dept = this.dept;
	}
	
	String getDept() {
		return this.dept;
	}
	
	void header() {
		for(int i =1;i<50;i++) {
		System.out.print("*");
		}
		System.out.println();
	}

}
