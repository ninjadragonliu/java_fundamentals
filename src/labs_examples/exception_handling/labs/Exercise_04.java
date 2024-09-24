package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {
        try {
            try {
                System.out.println("try 1");
                throw new Exception();
            } catch (Exception e) {
                System.out.println("catch 1");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("catch 2");
        }
    }
}