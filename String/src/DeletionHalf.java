import java.util.Scanner;

public class DeletionHalf {
    public DeletionHalf() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email id");
        String email = sc.nextLine();
        String del = " ";

        for(int i = 0; i < email.length() && email.charAt(i) != '@'; ++i) {
            del = del + email.charAt(i);
        }

        System.out.println(del);
    }
}