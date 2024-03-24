
public class MagicNum {
    public MagicNum() {
    }

    public static void main(String[] args) {
        int n = 6;
        int ans = 0;

        for(int base = 5; n > 0; base *= 5) {
            int last = n & 1;
            n >>= 1;
            ans += last * base;
        }

        System.out.println(ans);
    }
}
