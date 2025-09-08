
import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter number 2:");
        int num2 = sc.nextInt();
        System.out.println("number1=" + num1 + "\nnumber2=" + num2);
        System.out.println("num1+num2");
        System.out.println(num1 + num2);
        System.out.println("num1-num2");
        System.out.println(num1 - num2);
        System.out.println("num1/num2");
        System.out.println(num1 / num2);
        System.out.println("num1*num2");
        System.out.println(num1 * num2);
        System.out.println("num1%num2");
        System.out.println(num1 % num2);

    }
}