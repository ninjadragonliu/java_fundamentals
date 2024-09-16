package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + (double) sum / 10);
    }

}