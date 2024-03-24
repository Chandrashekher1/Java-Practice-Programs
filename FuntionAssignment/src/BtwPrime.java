import java.util.Scanner;

public class BtwPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int n1 = sc.nextInt();
        System.out.println("Enter second number :");
        int n2 = sc.nextInt();
        Bprime(n1, n2);
    }

    static void Bprime(int n1, int n2) {
        for(int i = n1; i <= n2; ++i) {
            int j;
            for(j = 2; j <= i && i % j != 0; ++j) {
            }

            if (i == j) {
                System.out.print("" + j + " ");
            }
        }

    }
}
