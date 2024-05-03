import java.util.*;

public class HashMapInro {
   public static void main(String[] args) {
      Map<Integer, String> mp = new HashMap<>();
      mp.put(20, "Rahul");
      mp.put(40, "Yeshu");
      mp.put(60, "Jaadu");
      mp.put(80, "Chandi");
      mp.put(100, "Lachhu");
      mp.put(120, "Abhishek");

      System.out.println(mp.get(100));
      mp.replace(20, "Rahul Bhardwaj");
      System.out.println(mp.get(20));

      System.out.println(mp.containsKey(60));
      System.out.println(mp.containsValue("Chandi"));

      System.out.println(mp.replace(120, "Bhaiya G"));
      System.out.println(mp.get(120));

      for (Map.Entry<Integer, String> i : mp.entrySet()) {
         System.out.print(i.getKey() + " : ");
         System.out.println(i.getValue());
      }

   }
}
