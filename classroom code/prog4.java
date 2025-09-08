import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double radius = sc2.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("area for given square is:" + area);
    }
}
