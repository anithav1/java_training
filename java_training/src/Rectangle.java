import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area and perimeter
        double area = calculateArea(length, breadth);
        double perimeter = calculatePerimeter(length, breadth);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);


        if (isSquare(length, breadth)) {
            System.out.println("It's a square!");
        } else {
            System.out.println("It's not a square.");
        }
    }

    private static double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    private static double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    private static boolean isSquare(double length, double breadth) {
        return length == breadth;
    }
}
