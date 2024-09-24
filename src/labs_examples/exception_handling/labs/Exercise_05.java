package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        int test = 10;
        int test2 = 0;
        if(test2 == 0) {
            throw new ArithmeticException();
        }
    }

}