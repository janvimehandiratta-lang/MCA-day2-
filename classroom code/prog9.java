import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        Scanner Sc7 = new Scanner(System.in);
        System.out.println("enter value of number 1");
        double num1 = Sc7.nextDouble();
        System.out.println("enter value of number 2");
        double num2 = Sc7.nextDouble();
        System.out.println("enter value of number 3");
        double num3 = Sc7.nextDouble();
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("average og given numbers is" + avg);
    }
}
