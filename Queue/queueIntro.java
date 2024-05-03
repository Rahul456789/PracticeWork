import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;

public class queueIntro {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(100);
        q1.add(111);
        q1.add(121);
        q1.add(130);

        q.addAll(q1);
        System.out.println(q);

        q.remove(120);
        System.out.println(q);

        q.removeIf(n -> n % 2 != 0);
        System.out.println(q);

        Predicate<Integer> even = n -> n % 2 == 0;

        q.removeIf(even);
        System.out.println(q);
    }
}
