public class findMaxInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 35, 10, 18, 30 };
        int largest = arr[0];

        for (int j = 0; j < arr.length; j++) {

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

        }

        System.out.println(largest);
    }
}
