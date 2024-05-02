import java.util.Scanner;

public class oddIndexedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        // int arr2[] = new int[arr.length];

        System.out.print("Enter values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
