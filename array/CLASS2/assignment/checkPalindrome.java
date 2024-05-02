import java.util.Scanner;

public class checkPalindrome {
    public static boolean palindrome(char arr[]) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            if (arr[s] != arr[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int size = s.nextInt();
        char[] arr = new char[size];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = s.next().charAt(i);
        }
        if (palindrome(arr) == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
