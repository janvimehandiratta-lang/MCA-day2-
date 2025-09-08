
import java.util.Scanner;

public class prog18 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc11.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                break;
            }

            System.out.println(ch);
        }
    }
}
