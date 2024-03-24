import java.util.Scanner;

public class AreaOfCircle {
    public AreaOfCircle() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        float rad = sc.nextFloat();
        if (rad < 0.0F) {
            System.out.println("Radius of circle is not negative ");
        }

        if (rad == 0.0F) {
            System.out.println("0");
        } else {
            System.out.println("Area of circle is =" + 3.14 * (double)rad * (double)rad);
        }

    }
}
