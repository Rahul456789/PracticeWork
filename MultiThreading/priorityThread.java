public class priorityThread extends Thread {
    public void run() {
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        priorityThread pt = new priorityThread();

        pt.setPriority(10);
        pt.start();

    }
}
