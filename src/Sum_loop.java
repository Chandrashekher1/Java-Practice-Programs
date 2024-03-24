import java.util.Scanner;

public class Sum_loop {
    public Sum_loop() {
    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int num = sc.nextInt();

        while(num != 0) {
            sum += num;
            System.out.print("Enter numbers :");
            num = sc.nextInt();
            System.out.println("Do you want to print further if yes enter any number if no enter 0");
        }

        System.out.print("Sum of all numbers :" + sum);
    }
}
