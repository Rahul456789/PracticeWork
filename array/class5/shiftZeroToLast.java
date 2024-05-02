public class shiftZeroToLast {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 0, 5, 4 };
        int arr1[] = new int[arr.length];
        int n = arr.length - 1;
        int m = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[m++] = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
