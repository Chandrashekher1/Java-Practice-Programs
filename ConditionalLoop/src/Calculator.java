import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while(true) {
            System.out.println("Enter your operator : ");
            char op = sc.next().trim().charAt(0);
            if (op != '+' && op != '-' && op != '*' && op != '%') {
                if (op == 'n' || op == 'N') {
                    return;
                }

                System.out.println("Invalid operator");
            } else {
                System.out.println("Enter first number :");
                int num1 = sc.nextInt();
                System.out.println("Enter second number :");
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }

                if (op == '-') {
                    ans = num1 - num2;
                }

                if (op == '*') {
                    ans = num1 * num2;
                }

                if (op == '%') {
                    ans = num1 % num2;
                }
            }

            System.out.println("Final answer is " + ans);
        }
    }
}
