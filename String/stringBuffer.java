
public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Hi I'm Rahul");

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.deleteCharAt(5);

        System.out.println(sb);

        sb.delete(4, 6);

        System.out.println(sb);

        sb.replace(0, 4, "i'm ");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
