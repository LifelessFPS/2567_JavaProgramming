/*=================LAB602==================*/

public class Student {
	private String name;
	private double[] scores;
	
	//method to set student detail
	public void  setStudentDetails(String stdName,double[] stdScores) {
		name = stdName;
		scores = stdScores;
	}
	
	//method to calculate average score
	public double calculateAverageScore() {
		//variable
		double total = 0;
		/*for(int i =0;i<score.length;i++) {
			total += score[i];
		}
		return total / score.length;*/
		for(double _scores:scores) {
			total += _scores;
		}
		return total / scores.length;
	}
		
	
	public char getGrade() {
		double average = calculateAverageScore();
		if(average>=80) {
			return 'A';
		}else if(average>=70) {
			return 'B';
		}else if(average>=60) {
			return 'C';
		}else if(average>=50) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
	//Method to display student detail
	public void displayStudentDetails() {
		System.out.println("Name: " + name);
		/*for(int i=0;i<scores.length;i++){
		System.out.print(scores[i]+" ");		
		}*/
		for(double _score:scores){
		System.out.print(_score+" ");			
		}
		
		System.out.println("\nAverage Score: "+ calculateAverageScore());
		System.out.println("Grade: " + getGrade());
	}

}
