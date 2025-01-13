import javax.swing.*;
public class Lab508 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
        int index;
        boolean isValidIndex;

        do {
            String input = JOptionPane.showInputDialog(null, "Input index of array:", "Input", JOptionPane.QUESTION_MESSAGE);
            index = Integer.parseInt(input);

            isValidIndex = checkIndex(nums, index);

            if (isValidIndex) {
                int current = currentData(nums, index);
                int prev = prevData(nums, index);
                int next = nextData(nums, index);

                String message = "Current data, nums[" + index + "] is " + current + "\n"
                               + "Previous data, nums[" + (index - 1) + "] is " + (prev == -1 ? "None" : prev) + "\n"
                               + "Next data, nums[" + (index + 1) + "] is " + (next == -1 ? "None" : next);
                
                JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid index. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!isValidIndex);

	}
	
	public static boolean checkIndex(int[] nums, int index) {
        // ตรวจสอบว่า index อยู่ในช่วงของ array หรือไม่
        return (index >= 0 && index < nums.length) ? true : false;
    }

    public static int currentData(int[] nums, int index) {
        // ดึงข้อมูลปัจจุบันตาม index
        return (index >= 0 && index < nums.length) ? nums[index] : -1;
    }

    public static int prevData(int[] nums, int index) {
        // ดึงข้อมูลก่อนหน้า ถ้าไม่มีให้ return -1
        return (index > 0 && index < nums.length) ? nums[index - 1] : -1;
    }

    public static int nextData(int[] nums, int index) {
        // ดึงข้อมูลถัดไป ถ้าไม่มีให้ return -1
        return (index >= 0 && index < nums.length - 1) ? nums[index + 1] : -1;
    }
	
	

}
