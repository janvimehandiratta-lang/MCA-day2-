import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = sc2.nextInt();
        System.out.println("enter number 2:");
        int num2 = sc2.nextInt();
        if (num1 > num2) {
            System.out.println("number1 is greater");
        } else {
            System.out.println("number2 is greater");
        }
    }
}
