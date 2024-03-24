
import java.util.Scanner;

public class StrLen {
    public StrLen() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] str = new String[size];
        int totalLen = 0;

        for(int i = 0; i < size; ++i) {
            str[i] = sc.next();
            int len = str[i].length();
            totalLen += len;
        }

        System.out.println(totalLen);
    }
}
