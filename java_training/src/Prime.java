public class Prime {
    public static void main(String[] args) {
        // Test the method with some numbers
        int number1 = 36;


        if (isPrime(number1)) {
            System.out.println(number1 + " is a prime number.");
        } else {
            System.out.println(number1 + " is not a prime number.");
        }


    }

    // Method to check whether a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
