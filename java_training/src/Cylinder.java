public class Cylinder {
    private double radius;
    private double height;

    // Non-parameterized constructor
    public Cylinder() {
        this.radius = 0.0;
        this.height = 0.0;
    }

    // Parameterized constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the area of the cylinder
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of the cylinder
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate the volume of the cylinder
    public double calculateVolume() {
        return calculateArea() * height;
    }

    public static void main(String[] args) {
        // Example usage
        Cylinder cylinder1 = new Cylinder();  // Non-parameterized constructor
        Cylinder cylinder2 = new Cylinder(3.0, 5.0);  // Parameterized constructor

        // Displaying the properties and calculated values
        System.out.println("Cylinder 1:");
        System.out.println("Radius: " + cylinder1.getRadius());
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Area: " + cylinder1.calculateArea());
        System.out.println("Perimeter: " + cylinder1.calculatePerimeter());
        System.out.println("Volume: " + cylinder1.calculateVolume());

        System.out.println("\nCylinder 2:");
        System.out.println("Radius: " + cylinder2.getRadius());
        System.out.println("Height: " + cylinder2.getHeight());
        System.out.println("Area: " + cylinder2.calculateArea());
        System.out.println("Perimeter: " + cylinder2.calculatePerimeter());
        System.out.println("Volume: " + cylinder2.calculateVolume());
    }
}
