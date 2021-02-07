package StreamsFilesAndDirectories;
//created by J.M.

import java.io.File;
import java.io.PrintWriter;

public class GetFolderSize {

    private static final String DIR_PATH = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced\\" +
            "StreamsFilesAndDirectories\\Conditions\\Resources-Exercise\\" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
    private static final String OUT_PATH = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced" +
            "\\StreamsFilesAndDirectories\\Conditions\\Resources-Exercise" +
            "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\merges.txt";

    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(OUT_PATH)){
            File folder=new File(DIR_PATH);
            File[]files=folder.listFiles();
            int size=0;
            assert files != null;
            for (File file : files) {
               size+=file.length();
            }
            writer.println("Folder size: "+size);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
