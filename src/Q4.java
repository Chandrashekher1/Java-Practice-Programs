import java.util.Scanner;

import java.util.Scanner;

public class Q4 {
    public Q4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number  :");
        int num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();
        int max = num1;
        if (num2 > num1) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        } else {
            max = num1;
        }

        System.out.print("Largest number is " + max);
    }
}
