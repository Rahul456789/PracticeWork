public class rotateRightArrayRight {
    public static void rotateArray(int arr[], int n) {
        n = n % arr.length;
        for (int k = 0; k < n; k++) {

            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        rotateArray(arr, 1);
        System.out.println();
        rotateArray(arr, 4);
    }
}