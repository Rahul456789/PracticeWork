public class sleepThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        sleepThread st1 = new sleepThread();
        st1.start();
        sleepThread st2 = new sleepThread();
        st2.start();
    }
}
