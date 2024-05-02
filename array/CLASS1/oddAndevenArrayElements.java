import java.util.Scanner;

public class oddAndevenArrayElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.print("Enter values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even Elements: " + arr[i]);

            } else {
                System.out.println("Odd Elements: " + arr[i]);
            }

        }
    }

}
