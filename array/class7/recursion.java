public class recursion {
    public static int recur(int n) {
        if (n < 1) {
            return 0;
        }
        System.out.println(n);
        return recur(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(recur(5));
    }
}
