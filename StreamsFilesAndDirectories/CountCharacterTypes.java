package StreamsFilesAndDirectories;
//created by J.M.

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CountCharacterTypes {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced" +
                "\\StreamsFilesAndDirectories\\Conditions\\Resources-Exercise" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced" +
                "\\StreamsFilesAndDirectories\\Conditions\\Resources-Exercise" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt"));

        Set<Character> punctuationList = new HashSet<>() {{ add('!');add('?');add(',');add('.'); }};
        Set<Character> vowelsList = new HashSet<>() {{ add('a');add('o');add('e');add('u');add('i'); }};
        int punctuations = 0, vowels = 0, consonants = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                if (punctuationList.contains(line.charAt(i))) {
                    punctuations++;
                } else if (vowelsList.contains(line.charAt(i))) {
                    vowels++;
                } else if (line.charAt(i) != ' ') {
                    consonants++;
                }
            }
        }
        writer.write(String.format("Vowels: %d%nConsonants: %d%nPunctuation: %d", vowels, consonants, punctuations));
        writer.close();
    }
}
