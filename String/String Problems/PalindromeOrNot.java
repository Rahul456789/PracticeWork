
public class PalindromeOrNot {
    public static boolean checkPalindrome(String str) {

        String str1 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }

        if (str.equals(str1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "naman isi naman";
        str = str.toUpperCase();
        boolean b = checkPalindrome(str);

        System.out.println(b);

        // String str1 = "Naman isi Naman";
        // str1 = str1.toLowerCase();

        // String arr[] = str1.split(" ");
        // String str2 = arr.toString();
        // String str3 = "";
        // for (int i = str2.length() - 1; i >= 0; i--) {
        // str3 += str2.charAt(i);
        // }
        // if (str2.equals(str3)) {
        // System.out.println(true);
        // }
    }
}
