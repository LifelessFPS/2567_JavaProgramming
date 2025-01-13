import java.util.Scanner;
public class Lab502 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of positive numbers
        int sum = sumOfPos(numbers);

        System.out.println();
        System.out.println("Summation of positive numbers is " + sum);
    }

    public static int sumOfPos(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

}


