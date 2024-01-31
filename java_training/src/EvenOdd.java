import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");


        int age = scanner.nextInt();


        if (age >= 20 && age <= 40) {
            System.out.println("Younger");
        } else if (age > 55) {
            System.out.println("Older");
        }


        scanner.close();
    }
}
