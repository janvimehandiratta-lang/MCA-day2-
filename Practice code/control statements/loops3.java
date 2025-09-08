import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int num = sc1.nextInt();
        System.out.println("table for number" + num + "is:-");
        int i = 0;
        do {
            System.out.println(num + "X" + i + "=" + (num * i));
            i++;
        } while (i <= 10);
    }

}
