package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo{

    public static void main(String[] args) {

    }

}

public class Exercise_02 <T extends Number> {
    T num;

    public T getNum() {
        return num;
    }
    public void setNum(T num) {
        this.num = num;
    }
}