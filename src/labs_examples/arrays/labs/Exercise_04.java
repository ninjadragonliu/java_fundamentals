package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        int [][] nums = new int[5][3];

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (i+1) * (j+1);
            }
        }
        for(int[] outer : nums) {
            for(int val : outer) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
