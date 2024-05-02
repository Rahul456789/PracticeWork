public class anagramString {
    public static void sort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swap
            char temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

        }
    }

    public static void main(String[] args) {

        String str = "abcd";
        String str1 = "abcd";
        char arr[] = str.toCharArray();
        char arr1[] = str1.toCharArray();
        sort(arr1);
        sort(arr);
        String s = new String(arr);
        String s1 = new String(arr1);

        if (s.equalsIgnoreCase(s1)) {
            System.out.println("panagram");
        } else {
            System.out.println("Not panagram");
        }

    }
}
