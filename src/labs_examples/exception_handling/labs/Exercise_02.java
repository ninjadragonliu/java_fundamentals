package labs_examples.exception_handling.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
public class Exercise_02 {

    public static void main(String[] args) {

        try {
            int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            int number = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (number == array[i]) {
                    System.out.println(i);
                }
            }
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Input must be an integer");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}

