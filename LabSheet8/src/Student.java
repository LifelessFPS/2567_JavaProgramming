public class Student {
	private String studentName;
	private int studentScore;
	
	//set get method
	void setName(String stdName) {
		studentName = stdName;
	}
	
	String getName() {
		return this.studentName;
	}
	
	void setScore(int stdScore) {
		studentScore = stdScore;
	}
	
	int getScore() {
		return this.studentScore;
	}
	
	//check the score is between 0-100
	boolean checkScore() {
		return getScore() >=0 && getScore() <= 100;
	}
	
	boolean isPass() {
		return getScore()>=50;
	}
	

}
