public class SUM {
    public SUM() {
    }

    public static void main(String[] args) {
        int num = 12345;
        int ans = PrintSum(num);
        System.out.println(ans);
    }

    static int PrintSum(int num) {
        return num == 0 ? 0 : num % 10 + PrintSum(num / 10);
    }
}
