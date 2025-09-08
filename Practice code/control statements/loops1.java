import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to print its table:");
        int num = sc.nextInt();
        System.out.println("table for number" + num + "is:-");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + (num * i));
        }

    }

}
