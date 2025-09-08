import java.util.Scanner;

public class conditional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number less than 10");
        int num = sc.nextInt();
        switch (num) {
            case 1: {
                System.out.println("one");
                break;

            }
            case 2: {
                System.out.println("Two");
                break;

            }

            case 3: {
                System.out.println("Three");
                break;

            }

            case 4: {
                System.out.println("Four");
                break;

            }
            case 5: {
                System.out.println("five");
                break;

            }
            case 6: {
                System.out.println("Six");
                break;

            }
            case 7: {
                System.out.println("Seven");
                break;

            }
            case 8: {
                System.out.println("Eight");
                break;

            }
            case 9: {
                System.out.println("Nine");
                break;

            }
            default:
                System.out.println("Number should be less than 10 onlyyy!!");
                break;
        }
    }

}
