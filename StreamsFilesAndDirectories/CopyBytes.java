package StreamsFilesAndDirectories;
//created by J.M.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyBytes {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("input.txt");
        FileOutputStream outputStream = new FileOutputStream("output.txt");
        PrintWriter writer = new PrintWriter(outputStream);

        int singleByte;

        while ((singleByte = inputStream.read()) >= 0) {
            char symbol= (char)singleByte;
            if(singleByte==10||singleByte==32){
                writer.print(symbol);
            }else{
                writer.print(singleByte);
            }
        }

        inputStream.close();
        writer.close();
    }
}
