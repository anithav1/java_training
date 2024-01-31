import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter the name");
        name = sc.toString();
        System.out.println("Enter the age");
        age = sc.nextInt();
        System.out.println("Hello world");

    }
}
