import java.util.Scanner;

public class Fmul {
    public Fmul() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        mul(num1, num2);
    }

    static void mul(int a, int b) {
        int prod = a * b;
        System.out.println("Product of two number is " + prod);
    }
}
