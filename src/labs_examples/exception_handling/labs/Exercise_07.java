package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07 {

    public static void main(String[] args) throws MyException {
        int a = 10;
        if(a == 10) {
            throw new MyException("a is 10");
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}