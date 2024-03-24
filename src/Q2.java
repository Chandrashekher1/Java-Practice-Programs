import java.util.Scanner;

public class Q2 {
    public Q2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle value : ");
        float p = sc.nextFloat();
        System.out.print("Enter the time : ");
        int t = sc.nextInt();
        System.out.print("Enter the Rate vale :");
        float r = sc.nextFloat();
        float SI = p * r * (float)t / 1000.0F;
        System.out.print("Simple interest :" + SI);
    }
}