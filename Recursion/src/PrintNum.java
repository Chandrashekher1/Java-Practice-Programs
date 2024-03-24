public class PrintNum {
    public static void main(String[] args) {
        int N = 10;
        PrintNumber(1, N);
    }

    static void PrintNumber(int i, int N) {
        if (i != N + 1) {
            System.out.println(i);
            PrintNumber(i + 1, N);
        }
    }
}
