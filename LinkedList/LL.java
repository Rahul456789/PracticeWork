import java.util.*;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();

        ll.add(5);
        ll.add(10);
        ll.add(20);
        ll.add(29);
        ll.add(43);

        System.out.println(ll);

        ll.removeLast();
        ll.addFirst(3);

        System.out.println(ll);

        LinkedList<Integer> ll1 = new LinkedList();

        ll1.add(25);
        ll1.add(120);
        ll1.add(240);
        ll1.add(229);
        ll1.add(437);

        System.out.println(ll.containsAll(ll1));

        ll.addAll(ll.size(), ll1);

        System.out.println(ll);

        System.out.println(ll.contains(120));
        ll.remove(6);
        System.out.println(ll);

        ll.removeAll(ll1);
        System.out.println(ll);

        // Returns head element of the LL
        System.out.println(ll.element());

        System.out.println(ll.get(3));

        Object arr[] = ll.toArray();

        System.out.println(arr.length);

        System.out.println(ll.hashCode());

        System.out.println(ll.indexOf(10));

        ll.add(10);
        System.out.println(ll);
        System.out.println(ll.lastIndexOf(10));

        boolean b = ll.isEmpty();
        System.out.println(b);

        String str = ll.toString();

        System.out.println(str);
        System.out.println(str.length());

        // Checking Data Type
        System.out.println(str.getClass().getName());

        ll.pop();
        System.out.println(ll);
        ll.push(66);
        System.out.println(ll);
    }
}
