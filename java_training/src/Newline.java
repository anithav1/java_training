import java.util.Scanner;

public class Newline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printDigits(number);
    }

    public static void printDigits(int number) {

        String numberStr = Integer.toString(number);


        for (int i = 0; i < numberStr.length(); i++) {
            System.out.println(numberStr.charAt(i));
        }
    }
}
