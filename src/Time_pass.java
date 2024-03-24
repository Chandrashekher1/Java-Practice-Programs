import java.util.Scanner;

public class Time_pass {
    public Time_pass() {
    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int N = sc.nextInt();

        for(int i = 0; i < N; ++i) {
            System.out.println("ENter all  number :");
            int num1 = sc.nextInt();
            sum += num1;
        }

        double Avg = (double)(sum / N);
        System.out.print(Avg);
    }
}
