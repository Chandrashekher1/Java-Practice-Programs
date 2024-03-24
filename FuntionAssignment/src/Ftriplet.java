import java.util.Scanner;

public class Ftriplet {
    public Ftriplet() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter third number :");
        int num3 = sc.nextInt();
        triplet(num1, num2, num3);
    }

    static void triplet(int num1, int num2, int num3) {
        int snum1 = num1 * num1;
        int snum2 = num2 * num2;
        int snum3 = num3 * num3;
        int sum = snum1 + snum2;
        if (sum == snum3) {
            System.out.println("Yes , it is pythagorean triplet ");
        } else {
            System.out.println("No, it is not a triplet");
        }

    }
}