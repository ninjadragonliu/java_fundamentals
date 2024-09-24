package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        try {
            System.out.println("0");
            System.out.println(1 / 0);
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
    }
}