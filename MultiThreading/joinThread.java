public class joinThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.err.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        joinThread j1 = new joinThread();
        joinThread j2 = new joinThread();
        joinThread j3 = new joinThread();

        j1.start();

        for (int i = 0; i < 3; i++) {
            try {
                j1.join();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        j2.start();
        j3.start();

    }
}
