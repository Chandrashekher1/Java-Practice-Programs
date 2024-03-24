public class Pattern2 {
    public static void main(String[] args) {
        int num = 5;
        Pattern2(num);
    }

    static void Pattern2(int num) {
        for(int row = 1; row <= num; ++row) {
            for(int col = 1; col <= row; ++col) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
