import java.util.Scanner;

public class arrayInReverseOrder {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 8, 10 };
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = s.nextInt();

        int arr1[] = new int[size];
        String arr2[] = new String[size];
        System.out.print("Enter the Values of array: ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = s.next();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
