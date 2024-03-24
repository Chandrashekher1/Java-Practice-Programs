public class Pattern3 {

    public static void main(String[] args) {
        int num = 5;
        pattern3(num);
    }

    static void pattern3(int num) {
        for(int row = 1; row <= num; ++row) {
            for(int col = 1; col <= num + 1 - row; ++col) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
