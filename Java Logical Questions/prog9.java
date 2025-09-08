import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        Scanner Sc6 = new Scanner(System.in);
        System.out.println("Enter a character to check wheather It's vowel or consonent");
        char ch = Sc6.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':

                System.out.println(ch + " is a Vowel");
                break;
            default:

                System.out.println(ch + " is a Consonant");
                break;
        }

    }
}
