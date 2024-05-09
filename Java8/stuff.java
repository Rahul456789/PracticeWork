
public class stuff {

    public static void doStuff() {
        System.out.println("This is some stuff");
        System.out.println("i'm second line");

    }

    // public static void threadTask() {
    // for (int i = 0; i <= 10; i++) {
    // System.out.println(i * 2);
    // try {
    // Thread.sleep(1000);

    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }
    // }

    public static void printNum() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
