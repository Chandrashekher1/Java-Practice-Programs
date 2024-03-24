import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        palindrome(num);
    }

    static void palindrome(int num) {
        int s = 0;

        int count;
        for(count = num; num > 0; num /= 10) {
            int rem = num % 10;
            s = s * 10 + rem;
        }

        if (count == s) {
            System.out.println("Palindrome number ");
        } else {
            System.out.println("Not a palindrome number");
        }

    }
}