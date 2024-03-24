import java.util.Scanner;

public class BuildArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[arr.length];

        int i;
        for(i = 0; i < size; ++i) {
            ans[i] = arr[arr[i]];
        }

        for(i = 0; i < size; ++i) {
            System.out.println(ans[i]);
        }

    }
}
