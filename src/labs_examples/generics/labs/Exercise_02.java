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

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(Exercise_02.sum(list));
    }

}

public class Exercise_02 <T extends Number> {

    public static <T extends Number> double sum(ArrayList<T> list) {
        double sum = 0;
        for (T t : list) {
            sum += t.doubleValue();
        }
        return sum;
    }
}