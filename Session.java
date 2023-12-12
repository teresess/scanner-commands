package Test.FOrTesting.src.main.test2;

public class Session extends Thread {
    Session() {}

    public void run() {
        while (true) {
            try {
                System.out.println("Session: started");
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
