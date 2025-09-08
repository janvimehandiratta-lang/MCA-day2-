import java.util.Scanner;

public class conditional1 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = sc1.nextInt();
        System.out.println("enter number 2:");
        int num2 = sc1.nextInt();
        System.out.println("enter number 3:");
        int num3 = sc1.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greatest");
        } else {
            System.out.println("num3 is greatest");
        }

    }
}
