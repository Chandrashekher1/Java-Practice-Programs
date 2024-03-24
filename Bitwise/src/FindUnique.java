public class FindUnique {
    public FindUnique() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 2, 6, 4, 3};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int n = var2[var4];
            unique ^= n;
        }

        return unique;
    }
}
