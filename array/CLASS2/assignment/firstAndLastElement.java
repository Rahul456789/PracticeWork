import java.util.Scanner;

public class firstAndLastElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 7 };
        int n = arr.length - 1;

        Scanner s = new Scanner(System.in);
        System.out.print("please enter the index value between 0 to " + n + ":");
        int i = s.nextInt();

        System.out.println("Value at " + i + "th index is: " + arr[i]);
    }
}
