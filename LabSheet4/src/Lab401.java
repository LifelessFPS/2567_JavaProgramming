import javax.swing.*;

public class Lab401 {
	
	//declare variable local can use every method
	static String varEmail;

	public static void main(String[] args) {
		inputEmail();

	}//end of main method
	public static void inputEmail() {
		String ans = "";
		do {
			varEmail=JOptionPane.showInputDialog("Input your Email");
			if(varEmail != null && !varEmail.isEmpty()) {//ไม่ใช่ค่าว่างเรียกใช้methodตรวจเช็คอีเมล
				checkEmailError(varEmail);
			}else {//ถ้าที่รับมาเป็นค่าว่างให้แสดวข้อความerror
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty");
			}
			ans = JOptionPane.showInputDialog("Continue?(y||Y to continue)");
		}while(ans != null && ans.equalsIgnoreCase("y"));
	}//End of inputEmail
	
	public static void checkEmailError(String email) {
		while(email.startsWith("@") || email.startsWith(" ")) {
			varEmail=JOptionPane.showInputDialog("Input your Email, again");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)
				?"Your e-mail is " + email
				:"Your e-mail is not email or hotmail address");
	}
	
	public static boolean checkEmail(String email) {
		
		/*if(email.endsWith("@gmail.com")|| email.endsWith("@hotmail.com")) {
			return true;
		}else {
			return false;
		}*/
		return (email.endsWith("@gmail.com")|| email.endsWith("@hotmail.com"));
	}

}
