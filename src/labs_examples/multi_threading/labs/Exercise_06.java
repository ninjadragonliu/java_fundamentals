package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

public class Exercise_06 {
    private static final int MAX_NUM = 100;
    private int currentNumber = 1;
    private final Object lock = new Object();

    public static void main(String[] args) {
        Exercise_06 obj = new Exercise_06();

        // Thread 1: Prints odd numbers
        Thread t1 = new Thread(() -> obj.printNumbers(1), "Thread-1");

        // Thread 2: Prints even numbers
        Thread t2 = new Thread(() -> obj.printNumbers(2), "Thread-2");

        t1.start();
        t2.start();
    }

    private void printNumbers(int threadId) {
        while (true) {
            synchronized (lock) {
                // Check if the current number exceeds the maximum number
                if (currentNumber > MAX_NUM) {
                    break;
                }

                // Thread-1 should print odd numbers, Thread-2 should print even numbers
                if (currentNumber % 2 == threadId % 2) {
                    System.out.println(Thread.currentThread().getName() + " prints: " + currentNumber);
                    currentNumber++;

                    // Notify the other thread to take over
                    lock.notify();
                } else {
                    try {
                        // Wait for the other thread to complete its turn
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}