public class Pattern7 {
    public Pattern7() {
    }

    public static void main(String[] args) {
        int num = 5;
        pattern7(num);
    }

    static void pattern7(int num) {
        for(int row = 1; row <= num; ++row) {
            int col;
            for(col = 1; col <= row; ++col) {
                System.out.print("  ");
            }

            for(col = 1; col <= num + 1 - row; ++col) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
