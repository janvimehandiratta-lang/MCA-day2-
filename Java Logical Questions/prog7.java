import java.util.Scanner;

public class prog7 {
    public static void main(String[] args) {
        Scanner Sc4 = new Scanner(System.in);
        System.out.println("enter a grade");
        int num = Sc4.nextInt();
        if (num >= 90) {
            System.out.println("Grade A");
        } else if (num >= 75) {
            System.out.println("Grade B");
        } else if (num >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail!!");
        }
    }
}
