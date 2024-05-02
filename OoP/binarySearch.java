
public class binarySearch {
    public static int biSearch(int arr[], int key, int l, int r, int m) {

        while (l != r) {
            if (arr[m] == key) {
                return m;
            }
            if (arr[m] > key) {
                return biSearch(arr, key, l, m, m);
            }
            if (arr[m] < key) {
                return biSearch(arr, key, m + 1, r, m);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 9, 10, 50, 70 };
        int l = 0;
        int r = arr.length - 1;
        int m = (l + r) / 2;

        System.out.println(biSearch(arr, 4, l, r, m));
    }
}
