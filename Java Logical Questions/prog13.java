import java.util.Scanner;

public class prog13 {
    public static void main(String[] args) {
        Scanner sc9 = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc9.nextInt();
        int fact = 1;
        int i = 1;

        do {
            fact = fact * i;
            i++;
        } while (i <= num);

        System.out.println("Factorial of " + num + " is: " + fact);

    }
}
