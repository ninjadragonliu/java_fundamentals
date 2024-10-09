package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

public class Exercise_03 {
    public static <T extends Number , V extends Number> double sum(T num1, V num2) {

        return num1.doubleValue() + num2.doubleValue();

    }

    public static <T extends Collection<String>> int countPalindromes(T list) {
        int count = 0;
        for (String s : list) {
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                count++;
            }
        }
        return count;
    }

    public static <T> T[] exchange(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }

    public static void main(String args[]) {
        double sum = sum(10, 20);
        System.out.println(sum);

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("racecar");
        int count = countPalindromes(list);
        System.out.println(count);

        int[] arr = {1, 2, 3, 4, 5};
        int[] result = exchange(arr, 0, 3);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}