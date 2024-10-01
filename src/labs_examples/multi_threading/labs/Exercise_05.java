package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

public class Exercise_05 {
    private boolean ready = false;

    public synchronized void waitUntilReady() {
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public synchronized void setReady() {
        ready = true;
        notify();
    }

    public static void main(String[] args) {
        Exercise_05 example = new Exercise_05();

        Thread thread = new Thread(() -> {
            example.waitUntilReady();
            System.out.println("Thread is ready to proceed");
        });
        thread.start();

        // Simulate some work
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        example.setReady();
    }
}
