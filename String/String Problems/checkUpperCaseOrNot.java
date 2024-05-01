
public class checkUpperCaseOrNot {
    public static void main(String[] args) {
        char[] arr = { 'a', 'X', 'Y', 'c', 'N' };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                System.out.println(arr[i] + ":" + " Upper Case");
            } else {
                System.out.println(arr[i] + ":" + " Lower Case");
            }
        }
    }
}
