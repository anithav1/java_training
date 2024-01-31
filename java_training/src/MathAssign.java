import java.util.Scanner;

public class MathAssign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for coefficients
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Calculate discriminant
        double Numerator = b * b - 4 * a * c;

        // Check if roots are real
        if (Numerator >= 0) {
            // Calculate roots
            double r1 = (-b + Math.sqrt(Numerator)) / (2 + a);
            double r2 = (-b - Math.sqrt(Numerator)) / (2 + a);

            // Display the roots
            System.out.println("r1= " + r1);
            System.out.println("r2= " + r2);
        } else {
            System.out.println("Roots are complex. Quadratic equation has no real roots.");
        }

        // Close the scanner
        scanner.close();
    }
}
