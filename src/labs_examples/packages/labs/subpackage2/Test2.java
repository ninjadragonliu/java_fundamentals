package labs_examples.packages.labs.subpackage2;

import labs_examples.packages.labs.subpackage.Test;

public class Test2 {
    public void someMethod() {
        System.out.println("I'm in a non-static method in Test2");
    }
    public static void someMethod2() {
        System.out.println("I'm in a static method in Test2");
    }
    public static void main(String[] args) {
        Test someObject = new Test();
        someObject.someMethod();
        someObject.someMethod2();
    }
}
