package StreamsFilesAndDirectories;

//created by J.M.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeCustomObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Serialize - for class must be Serializable !!!

        List<String> names = new ArrayList<>() {{
            add("Misho");
            add("Gosho");
            add("Pesho");
        }};

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("output.txt"));

        outputStream.writeObject(names);
        outputStream.close();

        //DeSerialize

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("output.txt"));

        List<String> readNames = (List<String>) inputStream.readObject();

        for (String readName : readNames) {
            System.out.println(readName);
        }
    }
}
