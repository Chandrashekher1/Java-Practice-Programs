import java.util.Scanner;

public class Q5 {
    public Q5() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currency in rupees : ");
        float Ir = (float)sc.nextInt();
        float USD = Ir / 83.0F;
        System.out.print("Rupees in dollars : " + USD);
    }
}
