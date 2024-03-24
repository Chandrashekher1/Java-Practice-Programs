import java.util.Scanner;

public class Factorial {
    public Factorial() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter number  :");

        for(int num = sc.nextInt(); num != 1; --num) {
            fact *= num;
        }

        System.out.println("Factorial of given number is  :" + fact);
    }
}
