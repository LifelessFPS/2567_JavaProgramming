import java.util.*;
public class Lab304 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // รับข้อความจากผู้ใช้
        System.out.print("Full name : ");
        String fullName = scanner.nextLine();

        // ค้นหาช่องว่างจากข้อความที่รับมา
        int space = fullName.indexOf(' '); // หาตำแหน่งของช่องว่าง

        if (space == -1) { // ถ้าไม่พบช่องว่าง
            System.out.println("Incorrect Name");
        } else {
            // ใช้ substring แยกชื่อและนามสกุล
            String firstName = fullName.substring(0, space); // ชื่อ
            String lastName = fullName.substring(space + 1); // นามสกุล

        
            if (!Character.isUpperCase(firstName.charAt(0)) || !Character.isUpperCase(lastName.charAt(0))) {
                System.out.println("Incorrect Name");
            } else {
            
                
                System.out.println("First Name: " + firstName.toUpperCase());
                System.out.println("Last Name: " + lastName.toLowerCase());
            }
        }

        scanner.close();

	}

}
