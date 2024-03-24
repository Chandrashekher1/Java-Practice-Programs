public class StrRev {
    public StrRev() {
    }

    public static void main(String[] args) {
        String[] str = new String[]{"h", "e", "l", "l", "o"};
        int idx = str.length - 1;
        Rev(str, idx);
    }

    static void Rev(String[] str, int idx) {
        if (idx == 0) {
            System.out.println(str[idx]);
        } else {
            System.out.println(str[idx]);
            Rev(str, idx - 1);
        }
    }
}
