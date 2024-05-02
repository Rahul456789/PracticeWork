public class reverseArrayWithoutAnotherArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3 };

        int s = 0;
        int e = arr.length - 1;
        int temp = 0;

        while (s < e) {
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
