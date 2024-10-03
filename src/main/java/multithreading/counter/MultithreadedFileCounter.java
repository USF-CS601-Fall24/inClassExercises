package multithreading.counter;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class MultithreadedFileCounter {
    private int count;
    private ExecutorService poolManager = Executors.newCachedThreadPool();
    private Phaser phaser = new Phaser();

    public class CounterWorker implements Runnable {
        private Path dir;
        private int localCount = 0;

        public CounterWorker(Path dir) {
            this.dir = dir;
        }

        @Override
        public void run() {
            try (DirectoryStream<Path> filesAndFolders = Files.newDirectoryStream(dir)) {
                for (Path path: filesAndFolders) {
                    if (Files.isDirectory(path)) {
                        // TODO: create a new worker for this directory
                        // Submit it to the pool
                        // Register it with the phaser

                    }
                    else {
                        // Update local count for this directory
                    }
                }
               // TODO: update the total count (synchronize thread access)

            } catch (IOException e) {
                System.out.println(e);
            }
            finally {
                // Call phaser.arriveAndDeregister() when the worker finishes the work
            }

        }
    }

    public int traverseDirectoryAndCountFiles(String directory) {
        int count = 0;
        Path dir = Paths.get(directory);
        // TODO:
        // Create the first counter worker, register it with the phaser,
        // and submit it to the pool manager
        // Call phaser.awaitAdvance(0); to wait for all threads to finish
        // Get the count
        // Shutdown the pool

        return count;
    }

    public static void main(String[] args) {
        MultithreadedFileCounter multiThCounter = new MultithreadedFileCounter();
        System.out.println(multiThCounter.traverseDirectoryAndCountFiles("dir"));
    }


}
