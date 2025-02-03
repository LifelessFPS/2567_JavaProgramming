
public class Car {
	private String companyName;
    private String modelName;
    private int year;
    private final double mileage;

    // Constructor ที่รับค่าพารามิเตอร์
    public Car(String companyName, String modelName, int year, double mileage) {
        setCompanyName(companyName);
        setModelName(modelName);
        setYear(year);
        this.mileage = mileage;
    }

    // Default Constructor
    public Car() {
        this.companyName = "Unknown";
        this.modelName = "Unknown";
        this.year = (2000 < 1886) ? 2000 : 2000;
        this.mileage = 0.0;
    }

    // Getter และ Setter
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.trim().isEmpty()) {
            System.out.println("Error: Invalid company or model name!");
        } else {
            this.companyName = companyName;
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == null || modelName.trim().isEmpty()) {
            System.out.println("Error: Invalid company or model name!");
        } else {
            this.modelName = modelName;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886) {
            System.out.println("Error: Invalid year!");
        } else {
            this.year = year;
        }
    }

    public double getMileage() {
        return mileage;
    }

    // แสดงข้อมูลของรถ
    public void displayCarInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
}
