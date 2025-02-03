
public class DemoCar {

	public static void main(String[] args) {
		// สร้างออบเจ็กต์ Car โดยใช้ Constructor แบบกำหนดค่าพารามิเตอร์
        Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);

        // แสดงข้อมูลเริ่มต้น
        System.out.println("Company Name: " + car.getCompanyName());
        System.out.println("Model Name: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());
        System.out.println();

        // อัปเดตข้อมูลใหม่ที่ถูกต้อง
        car.setCompanyName("Toyota");
        car.setModelName("Corolla");
        car.setYear(2015);

        // แสดงข้อมูลหลังจากอัปเดต
        System.out.println("Updated Car Details:");
        System.out.println("Company Name: " + car.getCompanyName());
        System.out.println("Model Name: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println();

        // ทดสอบการตั้งค่าที่ไม่ถูกต้อง
        car.setYear(1800); // ควรแสดง Error: Invalid year!
        car.setCompanyName(""); // ควรแสดง Error: Invalid company or model name!

	}

}
