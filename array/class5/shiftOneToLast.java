public class shiftOneToLast {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 1, 1, 2, 1, 7, 4 };
        int arr1[] = new int[arr.length];
        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                arr1[n++] = arr[i];
            }
        }

        while (n < arr.length) {
            arr1[n] = 1;
            n++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
