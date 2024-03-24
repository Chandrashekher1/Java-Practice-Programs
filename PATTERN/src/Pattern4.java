public class Pattern4 {
    public Pattern4() {
    }

    public static void main(String[] args) {
        int num = 5;
        pattern4(num);
    }

    static void pattern4(int num) {
        for(int row = 1; row <= num; ++row) {
            for(int col = 1; col <= row; ++col) {
                System.out.print(col);
            }

            System.out.println();
        }

    }
}