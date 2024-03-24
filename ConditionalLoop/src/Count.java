public class Count {
    public Count() {
    }

    public static void main(String[] args) {
        int num = 12345;

        int count;
        for(count = 0; num > 0; num /= 10) {
            int rem = num % 10;
            if (rem == num) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
