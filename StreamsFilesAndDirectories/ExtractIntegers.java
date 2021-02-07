package StreamsFilesAndDirectories;
//created by J.M.

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("input.txt");
        Scanner scan = new Scanner(inputStream);
        FileWriter writer = new FileWriter("output.txt");

        while (scan.hasNext()){
            if(scan.hasNextInt()) {
                int number = scan.nextInt();
                writer.write(String.valueOf(number));
                writer.write(System.lineSeparator());
            }
            scan.next();
        }
        writer.flush();
        inputStream.close();
    }
}
