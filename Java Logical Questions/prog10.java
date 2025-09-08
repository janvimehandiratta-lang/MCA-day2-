import java.util.Scanner;

public class prog10 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc7.nextInt();
        String result = (num % 3 == 0 && num % 5 == 0)
                ? "Divisible by both 3&5"
                : "not Divisible by both 3&5 ";

        System.out.println(result);

    }
}
