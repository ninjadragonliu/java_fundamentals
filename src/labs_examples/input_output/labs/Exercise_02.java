package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02 {

    public static void main(String[] args) throws IOException {
        String inputFile = "src/labs_examples/input_output/files/KtoD.txt";
        String outputFile = "src/labs_examples/input_output/files/KtoD_enc.txt";

        // Encrypt the file
        encryptFile(inputFile, outputFile);

        // Decrypt the file
        decryptFile(outputFile);
    }
    public static void encryptFile(String inputFile, String outputFile) {
            try(BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile)))
            {

                String line;
                while((line = br.readLine()) != null) {
                    String result = line.replaceAll("a", "-").replaceAll("e", "~");
                    bw.write(result);
                    bw.newLine();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    public static void decryptFile(String outputFile) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(outputFile))) {
            int character;
            while ((character = br.read()) != -1) {
                char c = (char) character;
                switch (c) {
                    case '-':
                        System.out.print('a');
                        break;
                    case '~':
                        System.out.print('e');
                        break;
                    default:
                        System.out.print(c);
                }
            }
        } catch (IOException e) {
            System.err.println("Error decrypting file: " + e.getMessage());
        }
    }
}