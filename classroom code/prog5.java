import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner Sc3 = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double radius = Sc3.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double height = Sc3.nextDouble();
        double pi = 3.14;
        double Volume = pi * (radius * radius) * height;
        System.out.println("volume of a cylinder:" + Volume);
    }

}
