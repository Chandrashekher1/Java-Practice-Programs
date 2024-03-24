public class StringSearch {
    public StringSearch() {
    }

    public static void main(String[] args) {
        System.out.println(search("Bhupendra Jogi", 'b'));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        } else {
            char[] var2 = str.toCharArray();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                char ch = var2[var4];
                if (ch == target) {
                    return true;
                }
            }

            return false;
        }
    }
}
