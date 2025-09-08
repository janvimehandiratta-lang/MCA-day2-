import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner Sc3 = new Scanner(System.in);
        System.out.println("enter a number");
        int i = Sc3.nextInt();
        System.out.println("square root is" + (i * i));
        System.out.println("Cube root is" + (i * i * i));
    }
}
