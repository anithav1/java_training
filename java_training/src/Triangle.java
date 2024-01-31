import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the base of the triangle
        System.out.print("Enter the base of triangle: ");
        double base = scanner.nextDouble();

        // Input for the height of the triangle
        System.out.print("Enter the height of triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
