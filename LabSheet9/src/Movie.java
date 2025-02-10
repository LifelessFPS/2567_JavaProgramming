
public class Movie {
	private String id;
	private String name;
	private Director director;
	
	Movie(String id,String name, Director director){
		this.id = id;
		this.name= name;
		this.director = director;
	}
	Movie(){
	
	}
	
	String getId() {
		return this.id;
	}
	String getName() {
		return this.name;
	}
	Director getDirector() {
		return this.director;
	}
	void setDirector(Director director) {
		this.director = director;
	}
	public String toString() {
		return getId()+" "+ getName()+"direct by" + director;
	}

}
