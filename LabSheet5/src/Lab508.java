import javax.swing.*;
public class Lab508 {

	public static void main(String[] args) {
		int[] nums =  {25, 78, 41, 22, 36, 85,37};
		
		int index = Integer.parseInt(JOptionPane.showInputDialog(null,"Input index of array:","Input",JOptionPane.QUESTION_MESSAGE));
		
		while(!checkIndex(nums, index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog(null,"Input index of array,again:","Input",JOptionPane.QUESTION_MESSAGE));
		}

	}
	
	public static boolean checkIndex(int[] nums,int index) {
		
		for(int _nums : nums) {
		
			boolean check = (index == _nums) ? true : false;
			
		}
		return checkIndex(nums, index);
		
		
	}
	
	public static int currntData(int[] nums,int index) {
		
	}
	
	public static int prevData(int[] nums,int index) {
		
	}
	
	public static int nextData(int[] nums,int index) {
		
	}
	
	

}
