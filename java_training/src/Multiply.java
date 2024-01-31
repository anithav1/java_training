import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number for multiplication table: ");


        int number = scanner.nextInt();


        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d * %d = %d%n", number, i, result);
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
