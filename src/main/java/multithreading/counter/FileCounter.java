package multithreading.counter;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**  A single-threaded program. Counts all .json files inside a given directory and its subdirectories.
 *   No multithreading. */
public class FileCounter {
    private int count;

    public FileCounter(){
        count = 0;
    }

    public void countFiles(Path directory) {
        try (DirectoryStream<Path> filesAndFolders = Files.newDirectoryStream(directory)) {
            for (Path path: filesAndFolders) {
                if (Files.isDirectory(path))
                    countFiles(path);
                else {
                    System.out.println(path);
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        FileCounter fileCounter = new FileCounter();
        fileCounter.countFiles(Paths.get("dir"));
        System.out.println(fileCounter.getCount());

    }

}
