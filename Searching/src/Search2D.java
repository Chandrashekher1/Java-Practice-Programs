import java.util.Scanner;

public class Search2D {
    public Search2D() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        int x;
        int i;
        for(x = 0; x < rows; ++x) {
            for(i = 0; i < cols; ++i) {
                arr[x][i] = sc.nextInt();
            }
        }

        System.out.println("Enter number to be search :");
        x = sc.nextInt();

        for(i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                if (arr[i][j] == x) {
                    System.out.println("x found at locations(" + i + ", " + j + ")");
                }
            }
        }

    }
}
