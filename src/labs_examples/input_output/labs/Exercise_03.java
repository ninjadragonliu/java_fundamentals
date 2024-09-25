package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */


public class Exercise_03 {

    public static void main(String[] args) {
        try {
            // 1. Demonstrating Byte Streams: FileInputStream and FileOutputStream
            System.out.println("Demonstrating FileInputStream and FileOutputStream");
            byteStreamExample();

            // 2. Demonstrating Character Streams: FileReader and FileWriter
            System.out.println("Demonstrating FileReader and FileWriter");
            characterStreamExample();

            // 3. Buffered Streams (Byte and Character)
            System.out.println("Demonstrating Buffered Streams");
            bufferedStreamExample();

            // 4. Demonstrating DataInputStream and DataOutputStream
            System.out.println("Demonstrating DataInputStream and DataOutputStream");
            dataStreamExample();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 1. Byte Stream Example
    public static void byteStreamExample() throws IOException {
        // Write bytes to a file
        FileOutputStream fos = new FileOutputStream("src/labs_examples/input_output/files/byteFile.dat");
        byte[] dataToWrite = {1, 2, 3, 4, 5};
        fos.write(dataToWrite);
        fos.close();

        // Read bytes from the file
        FileInputStream fis = new FileInputStream("src/labs_examples/input_output/files/random.dat");
        int byteData;
        System.out.print("Read bytes: ");
        while ((byteData = fis.read()) != -1) {
            System.out.print(byteData + " ");
        }
        System.out.println();
        fis.close();
    }

    // 2. Character Stream Example
    public static void characterStreamExample() throws IOException {
        // Write characters to a file
        FileWriter writer = new FileWriter("src/labs_examples/input_output/files/char_data_copy.txt");
        writer.write("Hello, World!");
        writer.close();

        // Read characters from the file
        FileReader reader = new FileReader( "src/labs_examples/input_output/files/char_data_copy.txt");
        int charData;
        System.out.print("Read characters: ");
        while ((charData = reader.read()) != -1) {
            System.out.print((char) charData);
        }
        System.out.println();
        reader.close();
    }

    // 3. Buffered Streams Example
    public static void bufferedStreamExample() throws IOException {
        // Buffered Byte Stream Example
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/labs_examples/input_output/files/byteFile.dat"));
        System.out.print("Buffered byte stream read: ");
        int byteData;
        while ((byteData = bis.read()) != -1) {
            System.out.print(byteData + " ");
        }
        System.out.println();
        bis.close();

        // Buffered Character Stream Example
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/labs_examples/input_output/files/char_data_2.txt"));
        bw.write("Buffered Hello, World!");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("src/labs_examples/input_output/files/char_data_2.txt"));
        System.out.print("Buffered character stream read: ");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    // 4. DataInputStream and DataOutputStream Example
    public static void dataStreamExample() throws IOException {
        // Write primitive data types to a file
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/labs_examples/input_output/files/random2.dat"));
        dos.writeInt(123);
        dos.writeDouble(45.67);
        dos.writeBoolean(true);
        dos.close();

        // Read primitive data types from the file
        DataInputStream dis = new DataInputStream(new FileInputStream("src/labs_examples/input_output/files/random.dat"));
        System.out.println("Read int: " + dis.readInt());
        System.out.println("Read double: " + dis.readDouble());
        System.out.println("Read boolean: " + dis.readBoolean());
        dis.close();
    }
}