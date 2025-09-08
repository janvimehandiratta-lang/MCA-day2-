import java.util.Scanner;

public class prog7 {
    public static void main(String[] args) {
        Scanner Sc5 = new Scanner(System.in);
        System.out.println("enter length of a rectangle");
        double length = Sc5.nextDouble();
        System.out.println("enter width of rectangle");
        double width = Sc5.nextDouble();
        double Perimeter = 2 * (length + width);
        System.out.println("perimeter of a rectangle =" + Perimeter);
    }
}
