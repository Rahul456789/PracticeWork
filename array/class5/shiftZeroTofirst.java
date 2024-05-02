public class shiftZeroTofirst {
    public static void main(String[] args) {
        int arr[] = { 2, 0, 5, 0, 6, 0 };
        int arr1[] = new int[arr.length];
        int m = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr1[m++] = arr[i];
            }

        }

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
