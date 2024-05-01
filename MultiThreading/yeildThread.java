public class yeildThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        yeildThread yt1 = new yeildThread();
        yeildThread yt2 = new yeildThread();

        yt1.start();
        yt2.start();
        for (int i = 0; i < 3; i++) {
            yt1.yield();
            System.out.println(Thread.currentThread().getName());
        }
    }
}
