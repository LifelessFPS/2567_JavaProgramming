
public class Director {
	private String name;
	private String email;
	private char gender;
	
	Director(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	Director(String name,String email){
		this.name = name;
		this.email = email;
		this.gender = ' ';
	}
	String getName() {
		return this.name;
	}
	String getemail() {
		return this.email;
	}
	String getGenderName() {
		if(Character.toLowerCase(gender) == 'm') {
			return "Male";
		}else if(Character.toLowerCase(gender) == 'f') {
			return "Female";
		}else return " ";
	}
	public String toString() {
		return getName()+"("+getemail()+":"+getGenderName()+")";
	}
}
