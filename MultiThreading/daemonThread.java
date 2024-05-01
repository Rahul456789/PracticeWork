public class daemonThread extends Thread {
    public void run() {
        if (!Thread.currentThread().isDaemon()) {
            System.out.println("User Thread : " + getName());
        } else {
            System.out.println("Daemon Thread : " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        daemonThread d1 = new daemonThread();

        d1.setDaemon(false);
        d1.start();

    }
}