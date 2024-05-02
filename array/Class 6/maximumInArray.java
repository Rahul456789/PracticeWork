public class maximumInArray {
    public static int maxInArray(int arr[]) {
        int flag = 0, i = 0, j = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
        }
        if (flag == 1) {
            return arr[j];
        } else {
            return arr[j + 1];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 11, 8 };
        System.out.println();

    }
}
