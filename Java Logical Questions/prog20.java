import java.util.Scanner;

public class prog20 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc12.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest element is: " + secondLargest);
    }
}
