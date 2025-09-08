import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc1.nextInt();
        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}
