
// import java.sql.Array;
import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 6, 8, 2, 7, 50, 45 };
        // int temp;

        // for (int i = 0; i < arr.length - 1; i++) {
        // int min = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] < arr[min]) {
        // temp = arr[j];
        // arr[j] = arr[min];
        // arr[min] = temp;

        // }

        // }
        // }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
