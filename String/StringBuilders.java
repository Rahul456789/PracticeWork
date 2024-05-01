
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(2);

        System.out.println(sb.capacity());

        sb.append("Rahul ");
        sb.append("Kumar ");
        sb.append("Jha");

        System.out.println(sb);

        System.out.println(sb.capacity());
        sb.ensureCapacity(37);
        System.out.println(sb.capacity());
        sb.delete(1, 3);

        System.out.println(sb);

        sb.insert(4, "Rahul ");
        System.out.println(sb);

        sb.delete(0, sb.length() - 3);
        System.out.println(sb);

        int n = sb.indexOf("Jha");
        System.out.println(n);

        StringBuilder sb1 = new StringBuilder("a b c d e f e a a c d d");

        int a = sb1.lastIndexOf("d");
        System.out.println(a);

        System.out.println(sb1.length());
        System.out.println(sb1.reverse());

        System.out.println(sb1.substring(4, 20));

        System.out.println(sb.compareTo(sb1));

        sb.append(sb1);
        System.out.println(sb);

        String s = " Hello";

        String str = sb.toString();
        System.out.println(str.concat(s));

    }
}
