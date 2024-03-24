import java.util.Scanner;

public class FArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle :");
        int rad = sc.nextInt();
        area(rad);
    }

    static void area(int r) {
        double circum = 2.0 * 3.14 * (double)r;
        System.out.println("Circumference of circle is " + circum);
        double area1 = 3.14 * (double)r * (double)r;
        System.out.println("Area of circle is " + area1);
    }
}