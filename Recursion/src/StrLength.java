public class StrLength {
    public StrLength() {
    }

    public static void main(String[] args) {
        String str = "Chandu";
        int ans = Strlen(str);
        System.out.println(ans);
    }

    static int Strlen(String str) {
        return str.length() == 0 ? 0 : str.length();
    }
}
