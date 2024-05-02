public class mergeSort {
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < L.length; i++) {
            L[i] = arr[l + i];
        }

        for (int i = 0; i < R.length; i++) {
            R[i] = arr[m + i + 1];
        }
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            k++;
            j++;
        }
    }

    public static void sort(int[] arr, int l, int r) {
        int m = (l + r) / 2;
        if (l < r) {
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 3, 10 };

        sort(arr, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
