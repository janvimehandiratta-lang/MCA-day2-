import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();
        System.out.println("table for number" + num + "is:-");
        int i = 0;
        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + (num * i));
            i++;
        }

    }
}
