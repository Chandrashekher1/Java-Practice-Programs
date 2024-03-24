public class Diamond {
    public Diamond() {
    }

    public static void main(String[] args) {
        int num = 5;
        hillP(num);
    }

    static void hillP(int num) {
        int row;
        int col;
        for(row = 1; row <= num; ++row) {
            for(col = 1; col <= num - row + 1; ++col) {
                System.out.print("  ");
            }

            for(col = 1; col <= row; ++col) {
                System.out.print(" *");
            }

            for(col = 2; col <= row; ++col) {
                System.out.print(" *");
            }

            System.out.println();
        }

        for(row = 1; row <= num; ++row) {
            for(col = 1; col <= row; ++col) {
                System.out.print(" ");
            }

            for(col = row; col <= num; ++col) {
                System.out.print("* ");
            }

            for(col = 2; col <= num; ++col) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
