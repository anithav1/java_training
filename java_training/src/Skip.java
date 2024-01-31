import java.util.Scanner;

public class Skip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the step to skip: ");
        int stepToSkip = scanner.nextInt();


        System.out.print("Enter the step to stop: ");
        int stepToStop = scanner.nextInt();


        for (int i = 1; i <= 100; i += stepToSkip) {
            // Use continue to skip the specified step
            if (i == stepToStop) {
                break;
            }
            System.out.println(i);
        }

        // Close the Scanner
        scanner.close();
    }
}
