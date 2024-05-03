import java.util.*;

public class LinkedHashSetIntro {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();

        s.add(40);
        s.add(40);
        s.add(90);
        s.add(100);

        System.out.println(s);

        Iterator<Integer> i = s.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(s.size());
        s.remove(90);
        System.out.println(s);

        System.out.println(s.size());

        Set<Integer> s1 = new HashSet<>();
        s1.add(40);
        s1.add(90);
        s1.add(300);
        s1.add(321);
        s.add(13);

        s.addAll(s1);
        System.out.println(s);

        System.out.println(s.equals(s1));

        System.out.println(s.containsAll(s1));

        System.out.println(s1.isEmpty());

        String str = s.toString();
        System.out.println(str.length());
        System.out.println(s.getClass().getName());

        Spliterator<Integer> sp = s.spliterator();
        System.out.println(sp);

    }

}