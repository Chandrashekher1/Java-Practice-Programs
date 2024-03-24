import java.util.Arrays;

public class SumTriangle {
    public SumTriangle() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        PrintArray(arr);
    }

    static void PrintArray(int[] arr) {
        if (arr.length >= 1) {
            int[] NewArr = new int[arr.length - 1];

            for(int i = 0; i < arr.length - 1; ++i) {
                int sum = arr[i] + arr[i + 1];
                NewArr[i] = sum;
            }

            PrintArray(NewArr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
