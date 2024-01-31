import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number from the keyboard
        int number = scanner.nextInt();


        int sum = 0;
        for (int i = number; i >= 1; i--) {
            sum += i;
        }

        System.out.printf("Sum of numbers from %d to 1 is: %d%n", number, sum);


        scanner.close();
    }
}
