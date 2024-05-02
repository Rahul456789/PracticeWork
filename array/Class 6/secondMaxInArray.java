public class secondMaxInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 3, 10 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("2nd Largest:" + arr[arr.length - 2]);
        System.out.println("3rd Largest:" + arr[arr.length - 3]);
        System.out.println("2nd Smallest:" + arr[1]);
    }
}
