package labs_examples.input_output.labs;

import labs_examples.input_output.examples.BufferedByteStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/labs_examples/input_output/files/char_data.txt");
        BufferedInputStream inputStream = new BufferedInputStream(fileInputStream);
        byte[] buffer = new byte[5];
        int bytesRead = 0;
        try {

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                // print out bytes read to console
                System.out.print(new String(buffer, 0, bytesRead));
            }

            inputStream.close();
            fileInputStream.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }
}