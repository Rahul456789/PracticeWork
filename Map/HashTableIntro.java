import java.util.*;

public class HashTableIntro {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Rahul", 1);
        ht.put("Pulkit", 2);
        ht.put("Abhishek", 3);
        ht.put("Jaadu", 4);
        ht.put("CR Saab", 5);
        ht.put("Yeshu", 6);
        ht.put("Lacchu", 7);

        System.out.println(ht);

        Enumeration<String> keys = ht.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(ht.get(key) + " : " + key);
        }

        System.out.println(ht.isEmpty());
        String str = ht.toString();
        System.out.println(str);
        System.out.println(str.length());

        ht.remove("CR Saab");
        System.out.println(ht);

        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(10, "Elvish");
        ht1.put(11, "Maxtern");
        ht1.put(12, "Rajat Dalal");
        ht1.put(14, "Harsh Beniwal");
        ht1.put(15, "Bhuvan B");

        System.out.println(ht1);

        System.out.println(ht.contains(ht1));
        System.out.println(ht.containsKey("Rahul"));

        System.out.println(ht1.clone());
        System.out.println(ht.size());

    }

}
