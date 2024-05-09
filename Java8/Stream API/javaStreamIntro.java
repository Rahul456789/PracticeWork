import java.util.*;
import java.util.stream.Collectors;

class A {

    int srno;
    String name;
    String rollNo;
    String add;

    public A(int srno, String name, String rollNo, String add) {
        super();
        this.srno = srno;
        this.name = name;
        this.rollNo = rollNo;
        this.add = add;
    }
}

class Product {
    int sno;
    String pName;
    String pId;
    int Price;

    public Product(int sno, String pName, String pId, int Price) {
        this.sno = sno;
        this.pName = pName;
        this.pId = pId;
        this.Price = Price;
    }
}

public class javaStreamIntro {
    public static void main(String[] args) {
        List<A> sl = new ArrayList<A>();
        A a = new A(1, "Rahul", "RWI753", "Rohtak, Hrayana");
        sl.add(a);
        sl.add(new A(2, "Mohan", "RWI007", "Rewari"));
        sl.add(new A(10, "Pulli", "RWI010", "Hisar"));
        sl.add(new A(20, "Mulli", "RWI011", "Bhiwani"));

        List<Integer> stateList = sl.stream().filter(p -> p.srno > 3).map(m -> m.srno).collect(Collectors.toList());
        System.out.println(stateList);

        List<Product> p = new ArrayList<>();
        p.add(new Product(1, "Mountain Dew", "x&(&vhj)", 50));
        p.add(new Product(2, "Sprite", "xxx&&5", 50));
        p.add(new Product(12, "Sting", "XHSGJ", 15));
        p.add(new Product(5, "Fanta", "XHScs", 50));

        List<String> topChoice = p.stream().filter(f -> f.Price > 20).map(m -> m.pName).collect(Collectors.toList());
        System.out.println(topChoice);

    }
}
