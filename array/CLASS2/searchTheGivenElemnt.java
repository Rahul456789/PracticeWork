public class searchTheGivenElemnt {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 10, 23, 5 };
        int key = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);
            }
        }
    }

}
