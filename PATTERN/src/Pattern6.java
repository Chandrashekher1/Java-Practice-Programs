public class Pattern6 {
    public Pattern6() {
    }

    public static void main(String[] args) {
        int num = 5;
        pattern6(num);
    }

    static void pattern6(int num) {
        for(int row = 1; row <= num; ++row) {
            int col;
            for(col = 1; col <= num - row + 1; ++col) {
                System.out.print("  ");
            }

            for(col = 1; col <= row; ++col) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }
}
