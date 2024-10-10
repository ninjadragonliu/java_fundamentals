package labs_examples.enumerations.labs;

import java.util.Scanner;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.print(Months.JANUARY);
                break;
            case 2:
                System.out.print(Months.FEBRUARY);
                break;
            case 3:
                System.out.print(Months.MARCH);
                break;
            case 4:
                System.out.print(Months.APRIL);
                break;
            case 5:
                System.out.print(Months.MAY);
                break;
            case 6:
                System.out.print(Months.JUNE);
                break;
            case 7:
                System.out.print(Months.JULY);
                break;
            case 8:
                System.out.print(Months.AUGUST);
                break;
            case 9:
                System.out.print(Months.SEPTEMBER);
                break;
            case 10:
                System.out.print(Months.OCTOBER);
                break;
            case 11:
                System.out.print(Months.NOVEMBER);
                break;
            case 12:
                System.out.print(Months.DECEMBER);
                break;
            default:
                System.out.print("Invalid month");
        }
    }
}

enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}