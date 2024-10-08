package multithreading.counter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

/** Multithreaded file word counter - rewrite the lab 10-04 exercise to use Phaser, do not need a list of Future-s in this case.
 *  See code examples for the lab10-04 solution and also for the example how to use Phaser. */
public class MultiThreadedFileWordCounterWithPhaser {
    private int totalCount;
    private ExecutorService poolManager = Executors.newCachedThreadPool();
    private Phaser phaser = new Phaser();

    public MultiThreadedFileWordCounterWithPhaser(){
        totalCount = 0;
    }

    class CounterWorker implements Runnable {
        private Path file;

        public CounterWorker(Path file) {
            this.file = file;
        }

        @Override
        public void run() {
            // FILL IN CODE:
            // Register with the phaser
            // Read the given text file and count words by updating a local count
            // Update the total count
            // Arrive and Deregister from phaser since you completed this task
        }
    }

    public void countWordsInFiles(Path directory) {
        try (DirectoryStream<Path> filesAndFolders = Files.newDirectoryStream(directory)) {
            for (Path path: filesAndFolders) {
                if (Files.isDirectory(path))
                    countWordsInFiles(path);
                else {
                    if (path.toString().endsWith(".txt")) {
                       // FILL IN CODE:
                        // Submit a CounterWorker task to the executor service
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    /** Wait for all tasks registered with the phaser to finish (deregister) and shutdown the pool. */
    public void waitToFinish() {
        phaser.awaitAdvance(0);
        poolManager.shutdownNow();
    }

    public static void main(String[] args) {
        MultiThreadedFileWordCounterWithPhaser fileCounter = new MultiThreadedFileWordCounterWithPhaser();
        // FILL IN CODE: invoke methods to count words in a directory dir,
        // and to wait for all tasks to finish before printing the total count of words.

    }
}
