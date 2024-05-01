public class ExtendingThreadClass extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        int n = 12; // Number of threads

        for (int i = 0; i < n; i++) {
            ExtendingThreadClass ex = new ExtendingThreadClass();
            ex.start();
        }
    }
}
