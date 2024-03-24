import java.util.Arrays;

public class Concatenation {
    public Concatenation() {
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 1};
        int n = num.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < num.length; ++i) {
            ans[i] = num[i];
            ans[i + n] = num[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
