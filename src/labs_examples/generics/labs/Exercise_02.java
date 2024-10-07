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
        Exercise_02<Integer> demo = new Exercise_02();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        double result = demo.sum(list);
        System.out.println(result);
    }

}

public class Exercise_02 <T extends Number> {

    public double sum(ArrayList<T> list) {
        double sum = 0;
        for (T t : list) {
            sum += t.doubleValue();
        }
        return sum;
    }
}