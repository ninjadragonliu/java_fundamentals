package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

public class Exercise_04 {

    public static void main(String[] args) {

        Counter counter = new Counter();
        MyThread2 myThread1 = new MyThread2(counter);
        MyThread2 myThread2 = new MyThread2(counter);

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();

            System.out.println(counter.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class MyThread2 extends Thread {
    private Counter counter;
    public MyThread2(Counter counter) {
        this.counter = counter;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
            counter.incrementUsingBlock();
        }
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

    public void incrementUsingBlock() {
        synchronized (this) {
            count++;
        }
    }
}