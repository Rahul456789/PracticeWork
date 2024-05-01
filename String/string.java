
public class string {
    public static void main(String[] args) {

        // All objects in Java are stored in a heap. The reference variable is to the
        // object stored in the stack area.
        // CharSequence : String , buffer & builder
        // String

        String s = new String("Hello");
        String s1 = "hello bro";
        System.out.println(s + " " + s1);

        // String Buffer

        StringBuffer sb = new StringBuffer();
        sb.append("Hello bhaisaab");
        System.out.println(sb);

        // string builder

        StringBuilder sbr = new StringBuilder();
        sbr.append("Kemchho! Mazaa Ma");
        System.out.println(sbr);
    }
}