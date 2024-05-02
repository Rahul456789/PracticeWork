public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 9 };
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < arr.length; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }
            }
            if (swapped == false) {
                break;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}