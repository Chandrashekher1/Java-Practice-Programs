public interface SUM2 {
    static void main(String[] args) {
        int num = 5;
        int i = 1;
        int sum = 0;
        SUM(i, num, sum);
    }

    static void SUM(int i, int num, int sum) {
        if (i == num) {
            sum += i;
            System.out.println(sum);
        } else {
            sum += i;
            SUM(i + 1, num, sum);
        }
    }
}