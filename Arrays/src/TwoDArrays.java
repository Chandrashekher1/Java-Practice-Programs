// Matrix
// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int cols = sc.nextInt();
        // Declaration of 2D arrays
        int [][]arr = new int[rows][cols];

        // input
        // use nested loops
        for(int i =0; i<rows; i++ ){     // for rows
            for(int j =0; j<cols;j++) {// for columns
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number to be search :");
        int x =sc.nextInt();

        // For output
        for(int i =0; i<rows;i++){
            for(int j =0; j<cols; j++){
                //System.out.print(arr[i][j] + " ");
                if(arr[i][j]==x){
                    System.out.println("x found at locations(" + i + ", " + j + ")");
                }
                //System.out.print(arr[i][j] + " ");
            }
            //System.out.println(); // for next line or gap between the rows
        }
    }
}
