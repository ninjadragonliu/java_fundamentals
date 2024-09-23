package labs_examples.static_nonstatic.labs;

public class Test {

    public static void main(String[] args) {

        System.out.println("I'm in the main method");
        Test someObject = new Test();
        someObject.someMethod();
        someObject.someMethod2();
    }
    public static void someMethod() {
        System.out.println("I'm in a static method");
    }
    public void someMethod2() {
        System.out.println("I'm in a non-static method");
    }
}
