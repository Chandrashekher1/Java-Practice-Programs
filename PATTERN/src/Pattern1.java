public class Pattern1 {
    public Pattern1() {
    }

    public static void main(String[] args) {
        int num = 5;
        pattern1(num);
    }

    static void pattern1(int num) {
        for(int row = 1; row <= num; ++row) {
            for(int col = 1; col <= num; ++col) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
