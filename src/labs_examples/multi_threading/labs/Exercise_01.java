package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
public class Exercise_01 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread, "MyThread");
        t.start();
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + Thread.currentThread().getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " terminating");
    }
}

