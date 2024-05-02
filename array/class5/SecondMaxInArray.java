
public class SecondMaxInArray {

    public static int maxInArray(int arr[]) {
        int largest = arr[0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

        }

        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 17, 13, 20 };
        System.out.println(maxInArray(arr));
    }
}
