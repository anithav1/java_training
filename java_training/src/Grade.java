import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first mark: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter the second mark: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter the third mark: ");
        int mark3 = scanner.nextInt();


        double average = (mark1 + mark2 + mark3) / 3.0;


        char grade;
        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }


        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);


        scanner.close();
    }
}
