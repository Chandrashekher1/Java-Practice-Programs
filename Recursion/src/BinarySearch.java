public class BinarySearch {
    public BinarySearch() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int start = 0;
        int end = arr.length - 1;
        int ans = binarySearch(arr, start, end, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                return arr[mid] < target ? binarySearch(arr, mid + 1, end, target) : binarySearch(arr, start, mid - 1, target);
            }
        } else {
            return -1;
        }
    }
}

