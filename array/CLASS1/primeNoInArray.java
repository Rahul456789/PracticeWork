import java.util.Scanner;

public class primeNoInArray {
    public static boolean checkPrime(int n) {
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Prime No: ");

        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
