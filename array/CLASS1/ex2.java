import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // double arr[] = { 76.0, 75.0, 84.6 };
        // float arr1[] = { 7, 87, 84 };
        int arr2[] = new int[3];
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);

        // }
        // for (int i = 0; i < arr.length; i++) {

        // System.out.println(arr1[i]);
        // }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = n;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
