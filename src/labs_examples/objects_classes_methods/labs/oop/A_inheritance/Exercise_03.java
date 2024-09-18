package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer: Because C_1 is a subclass of B_1 and B_1 is a subclass of A_1.
 * By default, C_1 constructor is called but Java calls it's super class constructor first.
 * so C_1 constructor calls B_1 constructor and B_1 constructor calls A_1 constructor
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
