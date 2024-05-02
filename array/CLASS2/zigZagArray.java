public class zigZagArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3 };
        int arr2[] = { 6, 7, 8, 9 };
        int arr3[] = new int[arr.length + arr2.length];
        int k = 0;
        int j = 0;

        for (int i = 0; i < arr3.length; i++) {
            if (j < arr.length) {
                arr3[i] = arr[j++];
                i++;

            }
            if (k < arr2.length) {
                arr3[i] = arr2[k++];

            } else {
                i--;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
