import java.util.Scanner;

public class BasicArea {
    public BasicArea() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of parallelogram :");
        int b = sc.nextInt();
        System.out.print("enter height of parallelogram :");
        int h = sc.nextInt();
        int area = b * h;
        System.out.print("Area of paralellogram is :" + area);
    }
}