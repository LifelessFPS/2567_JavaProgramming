
public class Author {
	private String name;
	private String email;
	
	public Author(String name,String email) {
		this.name = name;
		this.email = email;
	}
	
	public Author() {
		this(null, null);
	}
	
	String getName() {
		return this.name;
	}
	
	void setEmail(String email) {
		this.email=email;
	}
	
	String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return getName() + " (" + getEmail() + ")";
	}

}
