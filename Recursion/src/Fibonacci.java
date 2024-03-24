public class Fibonacci {
    public Fibonacci() {
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 2;
        fibon(a, b, n - 1);
    }

    static void fibon(int a, int b, int n) {
        if (n != 0) {
            int c = a + b;
            System.out.println(c);
            fibon(b, c, n - 1);
        }
    }
}
