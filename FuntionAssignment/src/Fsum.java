import java.util.Scanner;

public class Fsum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :");
        int num2 = sc.nextInt();
        sum(num1, num2);
    }

    static void sum(int a, int b) {
        int sum1 = a + b;
        System.out.println("Sum of two number is :" + sum1);
    }
}