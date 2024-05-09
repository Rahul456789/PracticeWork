import java.util.*;
import java.util.stream.Collectors;

public class streamApi {
    public static void main(String[] args) {
        List<String> list = List.of("Rahul", "Rohan", "Mohan", "Sohan", "Radhe");
        // Immutable list, old style

        List<String> l1 = new ArrayList<>();
        // New style , mutable
        l1.add("Ram");
        l1.add("Rahul");
        l1.add("Aman");
        l1.add("Anand");
        l1.add("Aishwariya");

        List<String> names = l1.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(names);

        List<String> names1 = list.stream().filter(e -> e.endsWith("n")).collect(Collectors.toList());
        System.out.println(names1);

        List<Integer> l2 = List.of(7, 30, 10, 4, 2, 9, 11);

        List<Integer> EvenNum = l2.stream().filter(f -> f % 2 == 0).collect(Collectors.toList());
        System.out.println(EvenNum);

        List<Integer> incrementedNum = l2.stream().map(m -> m + 1).collect(Collectors.toList());
        System.out.println(incrementedNum);

        l2.stream().sorted().forEach(System.out::println);
    }
}
