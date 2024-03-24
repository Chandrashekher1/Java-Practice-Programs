import java.util.Scanner;

public class CaseCheck {
    public CaseCheck() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Character :");
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowerCase");
        } else {
            System.out.println("UpperCase");
        }

    }
}