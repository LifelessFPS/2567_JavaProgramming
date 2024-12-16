import java.util.Scanner;
public class Lab306 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Message: ");
        String message = scanner.nextLine();

        // แปลงข้อความเป็นตัวพิมพ์เล็กทั้งหมด
        message = message.toLowerCase();

        // นับจำนวนคำว่า "nichi"
        int count = 0;
        int index = message.indexOf("nichi");
        while (index >= 0) {
            count++;
            index = message.indexOf("nichi", index + 1);
        }

        // แสดงผล
        if (count == 0) {
            System.out.println(message);
        } else {
        
            System.out.println("Nichi is a sentence" );
        }		

	}

}
