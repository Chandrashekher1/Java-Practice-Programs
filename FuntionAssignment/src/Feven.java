import java.util.Scanner;

public class Feven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        Even(num);
    }

    static void Even(int n) {
        if (n % 2 == 0) {
            System.out.println("" + n + " is a Even number ");
        } else {
            System.out.println("" + n + " is a odd number ");
        }
    }
}