import java.util.Scanner;

public class Ffactorial {
    public Ffactorial() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        fac(num);
    }

    static void fac(int num) {
        int fact;
        for(fact = 1; num > 1; --num) {
            fact *= num;
        }

        ++num;
        System.out.println(fact);
    }
}