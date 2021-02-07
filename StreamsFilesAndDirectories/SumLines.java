package StreamsFilesAndDirectories;
//created by J.M.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.IntStream;

public class SumLines {

    public static void main(String[] args) throws IOException {

        List<String> input = Files.readAllLines(Path.of("C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced" +
                "\\StreamsFilesAndDirectories\\Conditions\\Resources-Exercise" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));

        input.stream().mapToLong(line -> IntStream.range(0, line.length()).map(line::charAt).sum())
                .forEach(System.out::println);

    }
}
