import java.util.StringTokenizer;

public class CountTheNumWords {
    public static void main(String[] args) {
        String str = "Hi i am rahul bhardwaz";

        // String arr[] = str.split(" ");

        // System.out.println(arr.length);

        // Without using split()

        StringTokenizer str1 = new StringTokenizer(str);

        System.out.println(str1.countTokens());

        // Using toCharArray()

        char[] ch = str.toCharArray();
        int WordCount = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                WordCount++;
            }
        }
        System.out.println(WordCount + 1);

    }
}
