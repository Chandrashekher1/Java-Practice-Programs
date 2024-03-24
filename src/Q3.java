import java.util.Scanner;

import java.util.Scanner;

public class Q3 {
    public Q3() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter ypur operator '+', '-', '*' , '/' :  ");
        char op = sc.next().trim().charAt(0);
        int div;
        if (op == '+') {
            div = num1 + num2;
            System.out.println("Sum of two number is : " + div);
        } else if (op == '-') {
            div = num1 - num2;
            System.out.println("Subtrations of two number is : " + div);
        } else if (op == '*') {
            div = num1 * num2;
            System.out.print("Multiplication of two number is :" + div);
        } else if (op == '/') {
            div = num1 / num2;
            System.out.print("Division of two number is :" + div);
        } else {
            System.out.print("Aayein??");
        }

    }
}
