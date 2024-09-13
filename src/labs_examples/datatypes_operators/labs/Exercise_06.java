package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        double height = 5;
        double volume = 3.14 * (radius * radius) * height;
        double surfaceArea = 2 * 3.14 * radius + 2 * 3.14 * radius * height;
        System.out.println("Volume is " + volume);
        System.out.println("Surface area is " + surfaceArea);
    }
}