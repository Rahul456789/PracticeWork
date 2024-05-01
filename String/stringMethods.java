

public class stringMethods {
    public static void main(String[] args) {
        byte ascii[] = { 99, 98, 97 };
        char ch[] = { '2', 'a', 'c' };

        String s = new String(ascii);
        String s1 = new String(ch);

        System.out.println(s);
        System.out.println(s1);

        // Methods of String
        String str = "Hi Rahul";
        String str3 = "Hi rahul";
        String str1 = "aaabbbcdefghaaad";
        String str2 = "  aaabbbcdEfghaaaD  ";
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.substring(2, 7));
        System.out.println(str.concat("Kumar"));
        int a = str.indexOf("Rahul");
        System.out.println(a);
        int b = str1.indexOf("d", 2);
        System.out.println(b);
        int c = str1.lastIndexOf("d");
        System.out.println(c);
        boolean d = str2.equals(str1);
        System.out.println(d);
        boolean e = str1.equalsIgnoreCase(str2);
        System.out.println(e);

        int f = str1.compareTo(str2);
        System.out.println(f);
        // Str2 < str1 ==> Positive value

        int g = str.compareTo(str1);
        System.out.println(g);
        // Str < str1 ==> Negative value

        int h = str.compareTo(str3);
        System.out.println(h);
        // Str3 = str ==> 0 value

        int i = str.compareToIgnoreCase(str3);
        System.out.println(i);

        System.out.println(str2.trim());

        String str4 = str.replace("Rahul", "Mohit G");
        System.out.println(str4);

        System.out.println(str.contains("Rahul"));

        String sx = "GeeksForGeeks";
        char[] gfg = sx.toCharArray();

        System.out.println(gfg);

        for (int j = 0; j < gfg.length; j++) {
            System.out.print(gfg[j] + " ");
        }

    }
}
