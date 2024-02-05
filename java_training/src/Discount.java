public class Discount {
    public static void main(String[] args) {

        double totalCost1 = calculateTotalCost(300, 100, 100);
        displayBill(1, totalCost1, 300, 100, 100);

    }

    private static double calculateTotalCost(double... amounts) {
        double total = 0;

        for (double amount : amounts) {
            total += amount;
        }

        if (total >= 1000) {
            total -= total * 0.15; // 15% discount
        } else if (total >= 600) {
            total -= total * 0.10; // 10% discount
        } else if (total >= 500) {
            total -= total * 0.05; // 5% discount
        }

        return total;
    }

    private static void displayBill(int billNumber, double totalCost, double... amounts) {
        double sum = 0;

        for (double amount : amounts) {
            sum += amount;
        }

        System.out.println("Bill Number: " + billNumber);
        System.out.println("Sum of Amounts: " + sum);
        System.out.println("Total Cost: " + totalCost);

        System.out.println("------------------------");
    }
}
