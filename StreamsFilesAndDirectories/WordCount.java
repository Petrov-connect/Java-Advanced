package StreamsFilesAndDirectories;
//created by J.M.

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    private static final String IN_PATH_FIRST = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced\\" +
            "StreamsFilesAndDirectories\\Conditions\\Resources-Exercise\\" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
    private static final String IN_PATH_SECOND = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced\\" +
            "StreamsFilesAndDirectories\\Conditions\\Resources-Exercise\\" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
    private static final String OUT_PATH = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced" +
            "\\StreamsFilesAndDirectories\\Conditions\\Resources-Exercise" +
            "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\results.txt";

    public static void main(String[] args) {

        try (BufferedReader readWords = new BufferedReader(new FileReader(IN_PATH_FIRST));
             BufferedReader readText = new BufferedReader(new FileReader(IN_PATH_SECOND))) {
            PrintWriter writer = new PrintWriter(OUT_PATH);

            String[] words = readWords.readLine().split("\\s+");
            Map<String, Integer> wordOccurrences = Arrays.stream(words)
                    .collect(Collectors.toMap(word -> word, word -> 0, (a, b) -> b, LinkedHashMap::new));
            String[] text = readText.readLine().split("\\s+");
            Arrays.stream(text).filter(wordOccurrences::containsKey)
                    .forEach(word -> wordOccurrences.put(word, wordOccurrences.get(word) + 1));
            wordOccurrences.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(e -> writer.printf("%s - %d%n", e.getKey(), e.getValue()));
            writer.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
