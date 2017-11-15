public class Main {

    private static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 12;
        System.out.print("A(" + m + ", " + n + ") = ");
        System.out.println(ackermann(m, n));
    }
}
