public class palindromeNum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1 };
        int flag = 0;

        int n = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[n - 1 - i]) {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Non Palindrome");
        }
    }
}
