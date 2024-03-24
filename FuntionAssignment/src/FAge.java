import java.util.Scanner;

public class FAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age1 = sc.nextInt();
        age(age1);
    }

    static void age(int age1) {
        if (age1 >= 18) {
            System.out.println("you are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting ");
        }

    }
}
