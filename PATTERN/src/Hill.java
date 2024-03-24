public class Hill {
    public Hill() {
    }

    public static void main(String[] args) {
        int num1 = 5;
        RhillP(num1);
    }

    static void RhillP(int num) {
        for(int row = 1; row <= num; ++row) {
            int col;
            for(col = 1; col <= num + 1; ++col) {
                System.out.print(" ");
            }

            for(col = 1; col <= num + 1 - row; ++col) {
                System.out.print(" *");
            }

            for(col = 2; col <= num + 1 - row; ++col) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }
}
