import java.util.Scanner;

public class Fsum1 {
    static int sum = 0;

    public Fsum1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        sum1(num);
    }

    static int sum1(int num) {
        for(int i = 1; i <= num; ++i) {
            sum += i;
        }

        System.out.println(sum);
        return sum;
    }
}
