// Find the largest number
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int L = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        for(int num = sc.nextInt(); num != 0; num = sc.nextInt()) {
            if (num > L) {
                L = num;
            }
            System.out.print("Enter numbers : ");
        }
        System.out.println(L);
    }
}
