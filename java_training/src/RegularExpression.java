import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            String username = extractUsername(email);
            String domain = extractDomain(email);

            System.out.println("Email is valid.");
            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid email address.");
        }

        scanner.close();
    }


    private static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]*@[a-zA-Z0-9_+&*-]*.[a-zA-Z0-9_+&*-]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    private static String extractUsername(String email) {
        return email.split("@")[0];
    }


    private static String extractDomain(String email) {
        return email.split("@")[1];
    }
}