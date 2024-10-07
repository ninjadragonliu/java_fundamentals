package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01 <T> {
    T var1;
    T var2;

    public Exercise_01(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public T getVar2() {
        return var2;
    }

    public void setVar2(T var2) {
        this.var2 = var2;
    }
}

class Main {
    public static void main(String[] args) {
        Exercise_01<Integer> ex1 = new Exercise_01<>(1, 2);
        System.out.println(ex1.getVar1());
        System.out.println(ex1.getVar2());
    }
}