import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter number in celcius");
        double celsius = sc1.nextDouble();
        double fahrenhite = (celsius * 9 / 5) + 32;
        System.out.println("temperature in fahrenhiet is" + fahrenhite);
    }
}
