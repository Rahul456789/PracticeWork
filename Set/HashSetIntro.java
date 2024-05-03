import java.util.*;
import java.util.function.Predicate;

public class HashSetIntro {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        // It don't take duplicate values

        s.add(20);
        s.add(30);
        s.add(40);

        System.out.println(s);

        s.remove(30);
        System.out.println(s);

        Set<Integer> s1 = new HashSet<>();
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(20);

        s.addAll(s1);
        System.out.println(s);

        boolean b = s.equals(s1);
        System.out.println(b);

        System.out.println(s.size());
        // s.removeAll(s1);
        // System.out.println(s);

        Predicate<Integer> even = n -> n % 2 == 0;
        s.removeIf(even);
        System.out.println(s);

        s.add(100);
        s.add(150);
        s.add(200);

        Iterator<Integer> itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
