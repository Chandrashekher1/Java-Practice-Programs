public class EquivalentString {
    public EquivalentString() {
    }

    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        System.out.println(Equal(word1, word2));
    }

    static boolean Equal(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String[] var4 = word1;
        int var5 = word1.length;

        int var6;
        String word;
        for(var6 = 0; var6 < var5; ++var6) {
            word = var4[var6];
            sb1.append(word);
        }

        var4 = word2;
        var5 = word2.length;

        for(var6 = 0; var6 < var5; ++var6) {
            word = var4[var6];
            sb2.append(word);
        }

        return sb1.toString().equals(sb2.toString());
    }
}
