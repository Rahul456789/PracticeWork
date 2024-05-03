import java.util.*;

public class DeQue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(70);

        System.out.println(dq);

        dq.remove();
        System.out.println(dq);

        Queue<Integer> q = new LinkedList<>();
        q.add(100);
        q.add(120);
        q.add(150);
        q.add(20);

        dq.addAll(q);

        System.out.println(dq);
    }
}
