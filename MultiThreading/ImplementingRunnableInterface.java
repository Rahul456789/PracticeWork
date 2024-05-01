public class ImplementingRunnableInterface implements Runnable {
    public void show() {
        System.out.println("Multithreading Starts");
    }

    public void run() {
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        int n = 8;
        // Thread th1 = new Thread(new ImplementingRunnableInterface());
        // th1.start();

        for (int i = 0; i < n; i++) {
            Thread th = new Thread(new ImplementingRunnableInterface());
            th.start();
        }
    }
}
