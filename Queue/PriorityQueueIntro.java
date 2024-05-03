import java.util.*;
import java.util.function.Predicate;

public class PriorityQueueIntro {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(90);

        System.out.println(pq);

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        pq1.add(91);
        pq1.add(100);
        pq1.add(111);
        pq1.add(120);

        pq.addAll(pq1);
        System.out.println(pq);

        Predicate<Integer> odd = n -> n % 2 != 0;

        pq.removeIf(odd);
        System.out.println(pq);

        System.out.println(pq.retainAll(pq1));
        System.out.println(pq.containsAll(pq1));

        System.out.println(pq.contains(100));

        System.out.println(pq.isEmpty());
        // System.out.println(pq.equals(pq1));

        System.out.println(pq.size());
        System.out.println(pq.getClass().getName());

        // Object arr[] = pq.toArray();
        // System.out.println(arr.length);

        pq.remove();
        System.out.println(pq);

    }
}
