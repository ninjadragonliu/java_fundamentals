package labs_examples.static_nonstatic.labs;

public class Test {

    public static void main(String[] args) {

        System.out.println("I'm in the main method in Test");
        Test someObject = new Test();
        someObject.someMethod();
        someObject.someMethod2();

        Test2 someObject2 = new Test2();
        someObject2.someMethod();
        someObject2.someMethod2();
    }
    public static void someMethod() {
        System.out.println("I'm in a static method in Test");
    }
    public void someMethod2() {
        System.out.println("I'm in a non-static method in Test");
    }
    public void someMethod3() {
        someMethod2();
        someMethod();
        System.out.println("I'm in a non-static method 2 in Test");
    }
}
