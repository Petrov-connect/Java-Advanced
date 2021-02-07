package StreamsFilesAndDirectories;

//created by J.M.

import java.io.File;
import java.util.Objects;

public class NestedFolders {

    private static int foldersCount=0;

    public static void main(String[] args) {

        File file = new File("C:\\Users\\ADMIN\\Desktop\\demo\\Files-and-Streams");

        dfs(file);

        System.out.println(foldersCount+" folders");
    }

    private static void dfs(File file) {
        foldersCount++;
        for (File current : Objects.requireNonNull(file.listFiles())) {
            if(current.isDirectory()){
                dfs(current);
            }
        }
        System.out.println(file.getName());
    }
}
