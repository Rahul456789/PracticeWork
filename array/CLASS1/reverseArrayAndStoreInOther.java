import java.util.Scanner;

public class reverseArrayAndStoreInOther {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        int arr2[] = new int[arr.length];

        System.out.print("Enter values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
            System.out.print(arr2[i]);

        }

    }
}
