public class Pattern9 {
    public Pattern9() {
    }

    public static void main(String[] args) {
        int num = 5;
        Pattern9(num);
    }

    static void Pattern9(int num) {
        for (int row = 1; row <= num; ++row) {
            int col;
            for (col = 1; col <= row; ++col) {
                System.out.print(" ");
            }

            for (col = 1; col <= num + 1 - row; ++col) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
