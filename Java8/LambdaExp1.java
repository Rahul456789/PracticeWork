public class LambdaExp1 {
    interface funInterface {
        int opr(int a, int b);
    }

    interface funcInterface1 {
        void sayMesage(String message);
    }

    int operate(int a, int b, funInterface fobj) {
        return fobj.opr(a, b);
    }

    public static void main(String[] args) {
        funInterface mul = (a, b) -> (a * b);

        funInterface add = (a, b) -> (a + b);

        // Test Object

        LambdaExp1 tobj = new LambdaExp1();

        System.out.println(tobj.operate(5, 10, mul));
        System.out.println(tobj.operate(10, 10, add));

        funcInterface1 obj = message -> System.out.println("Hello" + message);
        obj.sayMesage("Rahul");

    }
}
