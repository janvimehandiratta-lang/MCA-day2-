
import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {
        Scanner Sc4 = new Scanner(System.in);
        System.out.println("enter principal amount");
        double Principal = Sc4.nextDouble();
        System.out.println("enter rate of interest");
        double Rate = Sc4.nextDouble();
        System.out.println("enter time");
        double Time = Sc4.nextDouble();
        double SimpleInterest = (Principal * Rate * Time) / 100;
        System.out.println("Simple intrest =" + SimpleInterest);
    }
}
