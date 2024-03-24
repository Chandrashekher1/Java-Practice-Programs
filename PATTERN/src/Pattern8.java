public class Pattern8 {
    public Pattern8() {
    }

    public static void main(String[] args) {
        int num = 5;
        Pattern8(num);
    }

    static void Pattern8(int num) {
        for(int row = 1; row <= num; ++row) {
            int col;
            for(col = 1; col <= num + 1 - row; ++col) {
                System.out.print(" ");
            }

            for(col = 1; col <= row; ++col) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
