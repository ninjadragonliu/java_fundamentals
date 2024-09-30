package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

public class Exercise_02 {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        myThread.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + Thread.currentThread().getName() +
                        ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted");}
        }

}