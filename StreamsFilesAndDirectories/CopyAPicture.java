package StreamsFilesAndDirectories;
//created by J.M.

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyAPicture {

    private static final String IN_PATH = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced\\" +
            "StreamsFilesAndDirectories\\Conditions\\Resources-Exercise\\" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\picture.jpg";
    private static final String OUT_PATH = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced" +
            "\\StreamsFilesAndDirectories\\Conditions\\Resources-Exercise" +
            "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\picture-copy.jpg";

    public static void main(String[] args) {

        try(FileInputStream fileInputStream = new FileInputStream(IN_PATH);
            FileOutputStream fileOutputStream = new FileOutputStream(OUT_PATH)){
            int oneByte;
            while ((oneByte=fileInputStream.read())!=-1){
                fileOutputStream.write(oneByte);
            }

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
