public class shiftArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 4 };
        int e = arr.length - 1;
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; ++i) {

            arr[i] = arr[i + 1];

        }
        arr[e] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
