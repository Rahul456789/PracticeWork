public class MethodRef {
    public static void main(String[] args) {
        // Implememtation of workinter

        // WorkInter wi = () -> {
        // System.out.println("this is do task");
        // };

        // wi.doTask();

        // Refferring Static method
        // WorkInter wi = stuff::doStuff;

        // wi.doTask();

        // Runnable r = stuff::threadTask;

        // Thread t = new Thread(r);
        // t.start();

        // Non Static Method
        stuff obj = new stuff();
        Runnable r1 = obj::printNum;

        Thread t1 = new Thread(r1);
        t1.start();

    }
}
