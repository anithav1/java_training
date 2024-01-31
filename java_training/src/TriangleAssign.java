import java.util.Scanner;

public class TriangleAssign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the sides of the triangle
        System.out.print("Enter the length of side 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side 'c': ");
        double c = scanner.nextDouble();

        // Calculate the semi-perimeter (s)
        double s = (a + b + c) / 2;

        // Calculate the area of the triangle
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner
        scanner.close();


        
    }
}
