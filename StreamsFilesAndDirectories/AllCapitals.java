package StreamsFilesAndDirectories;
//created by J.M.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals {

    public static void main(String[] args) throws IOException {

        List<String> input = Files.readAllLines(Path.of("C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced" +
                "\\StreamsFilesAndDirectories\\Conditions\\Resources-Exercise" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced" +
                "\\StreamsFilesAndDirectories\\Conditions\\Resources-Exercise" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt"));

        for (String line : input) {
            writer.write(line.toUpperCase());
            writer.newLine();
        }
        writer.close();
    }
}
