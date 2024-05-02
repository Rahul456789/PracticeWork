public class productOfArray {
    public static void main(String[] args) {
        int sum = 1;
        int arr[] = { 1, 2, 3, 2 };

        for (int i = 0; i < arr.length; i++) {
            sum = sum * arr[i];
        }
        System.out.println(sum);
    }
}
