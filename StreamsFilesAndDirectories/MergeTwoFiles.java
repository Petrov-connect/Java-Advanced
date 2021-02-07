package StreamsFilesAndDirectories;
//created by J.M.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergeTwoFiles {

    private static final String IN_PATH_FIRST = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced\\" +
            "StreamsFilesAndDirectories\\Conditions\\Resources-Exercise\\" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
    private static final String IN_PATH_SECOND = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced\\" +
            "StreamsFilesAndDirectories\\Conditions\\Resources-Exercise\\" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
    private static final String OUT_PATH = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced" +
            "\\StreamsFilesAndDirectories\\Conditions\\Resources-Exercise" +
            "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\merges.txt";

    public static void main(String[] args) {

        try (BufferedReader readFirst = new BufferedReader(new FileReader(IN_PATH_FIRST));
             BufferedReader readSecond = new BufferedReader(new FileReader(IN_PATH_SECOND))) {
            PrintWriter writer = new PrintWriter(OUT_PATH);
            String line;
            while ((line=readFirst.readLine())!=null){
                writer.println(line);
            }
            while ((line=readSecond.readLine())!=null){
                writer.println(line);
            }
            writer.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
