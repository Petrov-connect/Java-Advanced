package StreamsFilesAndDirectories;

//created by J.M.

import java.io.File;

public class ListFiles {

    public static void main(String[] args) {

        File file = new File(
                "C:\\Users\\ADMIN\\Desktop\\demo\\Files-and-Streams");
        File [] innerFiles=file.listFiles();
        assert innerFiles != null;
        for (File innerFile : innerFiles) {
            if(!innerFile.isDirectory()){
                System.out.printf("%s: [%d]%n",innerFile.getName(),innerFile.length());
            }
        }
    }
}
