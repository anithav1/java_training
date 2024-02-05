public class ArrayMax {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 12, 8, 25, 18, 9, 15, 7};


        int[] result = findFirstAndSecondLargest(numbers);

        // Print the results
        System.out.println("The 1st largest value in the array is: " + result[0]);
        System.out.println("The 2nd largest value in the array is: " + result[1]);
    }


    private static int[] findFirstAndSecondLargest(int[] arr) {


        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }

        return new int[]{firstMax, secondMax};
    }
}
