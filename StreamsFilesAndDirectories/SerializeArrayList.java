package StreamsFilesAndDirectories;
//created by J.M.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class SerializeArrayList {

    private static final String PATH = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced\\" +
            "StreamsFilesAndDirectories\\Conditions\\Resources-Exercise\\" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\list.ser";

    public static void main(String[] args) {

        List<Double>list= List.of(1.1,2.2,3.3,4.4,5.5);
        //serialize:
        try(FileOutputStream outputStream = new FileOutputStream(PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(list);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //deserialize:
        try(FileInputStream inputStream = new FileInputStream(PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            List<Double> deserializeList = (List<Double>) objectInputStream.readObject();
            deserializeList.forEach(System.out::println);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
