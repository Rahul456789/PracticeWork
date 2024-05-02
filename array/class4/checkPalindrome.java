public class checkPalindrome {
    public static void main(String[] args) {
        int i = 0, n = 50, j = 1, sum = 0;

        System.out.println(i);
        System.out.println(j);
        for (int k = 1; k < n - 2; k++) {
            sum = i + j;
            i = j;
            j = k;
            System.out.println(sum);

        }
    }
}