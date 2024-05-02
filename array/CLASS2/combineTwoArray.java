public class combineTwoArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9 };
        int arr3[] = new int[arr.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr.length) {
                arr3[i] = arr[i];
            } else {
                arr3[i] = arr2[k++];
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}