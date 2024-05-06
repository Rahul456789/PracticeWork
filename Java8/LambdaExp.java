interface funcInterface {

    void abstractFun(int x);

    default void normalFun() {
        System.out.println("Hello World");
    }
}

public class LambdaExp {
    public static void main(String[] args) {

        // Lambda Expression
        funcInterface obj = (int x) -> System.out.println(10 * x);

        obj.abstractFun(5);
        obj.normalFun();
    }
}
