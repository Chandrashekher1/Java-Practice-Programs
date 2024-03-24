import java.util.Scanner;

public class AreaOfTriangle {
    public AreaOfTriangle() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of Triangle :");
        int h = sc.nextInt();
        System.out.println("Enter the breadth of Triangle :");
        int b = sc.nextInt();
        if (h >= 0 && b >= 0) {
            int area = h * b / 2;
            System.out.println("Area of the Triangle is :" + area);
        } else {
            System.out.println("Enter valid height and breadth");
        }

    }
}