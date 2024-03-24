public class SquareRoot {
    public SquareRoot() {
    }

    public static void main(String[] args) {
        System.out.println(Sqrt(4));
    }

    public static int Sqrt(int x) {
        if (x == 0) {
            return 0;
        } else {
            int low = 1;
            int high = x;

            while(low <= high) {
                int mid = low + (high - low) / 2;
                if (mid == x / mid) {
                    return mid;
                }

                if (mid > x / mid) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return high;
        }
    }
}
