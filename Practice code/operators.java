import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter number 2:");
        int num2 = sc.nextInt();
        System.out.println("number1=" + num1 + "\nnumber2=" + num2);
        System.out.println("Aritmatic Operator");
        System.out.println("num1+num2");
        System.out.println(num1 + num2);
        System.out.println("num1-num2");
        System.out.println(num1 - num2);
        System.out.println("num1/num2");
        System.out.println(num1 / num2);
        System.out.println("num1*num2");
        System.out.println(num1 * num2);
        System.out.println("num1%num2");
        System.out.println(num1 % num2);

        System.out.println("Logical Operator:");
        System.out.println("&& operator");
        if (num1 > 50 && num2 > 60) {
            System.out.println(num1 + num2);
        }
        System.out.println("|| operator");
        if (num1 > 50 || num2 > 60) {
            System.out.println(num1 + num2);
        }

        System.out.println("bitwise Operator:");
        int result1 = num1 & num2;
        System.out.println("& operator \n" + result1);
        int result2 = num1 | num2;
        System.out.println("| operator \n" + result2);
        int result3 = ~num1;
        System.out.println("~ operator \n" + result3);

        System.out.println("Increament Decrement Operator:");
        int result4 = num1++;
        System.out.println("++ operator \n" + result4);
        int result5 = num1++;
        System.out.println("-- operator \n" + result5);

        System.out.println("Relational operators:");
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 != num2 : " + (num1 != num2));
        System.out.println("num1 > num2  : " + (num1 > num2));
        System.out.println("num1 < num2  : " + (num1 < num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));

    }
}