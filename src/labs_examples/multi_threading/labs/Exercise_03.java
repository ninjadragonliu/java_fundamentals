package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

public class Exercise_03 {

    public static void main(String[] args) {

        MyThread1 myThread = new MyThread1();
        MyThread1 myThread2 = new MyThread1();

        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread2.setPriority(Thread.MAX_PRIORITY);
        myThread.start();
        myThread2.start();
    }
}