
public class ExceptHandling {
    public static void main(String[] args) {
        int a = 6;
        int b = 1;
        String str = "123";

        try {
            System.out.println(a / b);
            int s = Integer.parseInt(str) / 2;
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e + " Can't Divide with 0");
        } finally {
            System.out.println("Finally Executed");
        }
        System.out.println("Out of exception Handling block");
    }
}
