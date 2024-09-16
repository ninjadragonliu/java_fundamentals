package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c)
    {
        return a + b + c;
    }
    public static void changeValue(int x) {
        x = 10;
    }

    public static void changeReference(Dog dog) {
        dog.name = "Rex";
    }
    public static int largest(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        } else if (b > c && b > d) {
            return b;
        } else if (c > d) {
            return c;
        } else {
            return d;
        }
    }
    public static int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                count++;
            }
        }
        return count;
    }
    public static boolean prime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //1) Demonstrate method overloading
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));

        //2) Demonstrate the difference between "pass by value" and "pass by reference"
        // Pass by value
        int x = 5;
        System.out.println("Before method call: x = " + x);
        changeValue(x);
        System.out.println("After method call: x = " + x);

        // Pass by reference
        Dog myDog = new Dog("Fido");
        System.out.println("Before method call: myDog.name = " + myDog.name);
        changeReference(myDog);
        System.out.println("After method call: myDog.name = " + myDog.name);

        //3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
        System.out.println(largest(1, 2, 3, 4));

        //4) Write a method to count all consonants (the opposite of vowels) in a String
        System.out.println(countConsonants("hello"));

        //5) Write a method that will determine whether or not a number is prime
        System.out.println(prime(5));

        //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
        //            which is passed in as an argument
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = getMinMax(numbers);
        for(int i : result)
        {
            System.out.println(i);
        }

        //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        //        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        //        length of the returned list
        System.out.println(getDivisibleNumbers(10, 2, 3));
        System.out.println(getDivisibleNumbers(10, 2, 3).size());

        //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        //        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        //        variable is used to temporarily store individual values in the array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    private static int[] getMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return new int[] {min, max};
    }
    public static ArrayList<Integer> getDivisibleNumbers(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }
}
