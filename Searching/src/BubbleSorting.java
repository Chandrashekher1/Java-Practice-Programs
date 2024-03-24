public class BubbleSorting {
    public BubbleSorting() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 3, 2, 1};

        int j;
        int temp;
        for(int i = 0; i < arr.length - 1; ++i) {
            for(j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int[] var6 = arr;
        j = arr.length;

        for(temp = 0; temp < j; ++temp) {
            int value = var6[temp];
            System.out.print("" + value + " ");
        }

    }
}
