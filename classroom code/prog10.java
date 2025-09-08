import java.util.Scanner;

public class prog10 {
    public static void main(String[] args) {
        Scanner Sc8 = new Scanner(System.in);
        System.out.println("enter the distance in kilometers");
        double kilometers = Sc8.nextDouble();
        double Miles = kilometers * 0.621371;
        System.out.println("the distance in miles=" + Miles);
    }
}
