public class Circle {
    public static void main(String[] args) {

        double radius = 5.0;
        double diameter = 10.0;


        double area1 = calculateAreaByRadius(radius);
        System.out.println("Area of circle with radius " + radius + ": " + area1);


        double area2 = calculateAreaByDiameter(diameter);
        System.out.println("Area of circle with diameter " + diameter + ": " + area2);
    }


    private static double calculateAreaByRadius(double radius) {
        return Math.PI * radius * radius;
    }


    private static double calculateAreaByDiameter(double diameter) {
        double radius = diameter / 2.0;
        return calculateAreaByRadius(radius);
    }
}
