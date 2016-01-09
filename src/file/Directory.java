package file;

import java.io.File;
import java.io.IOException;

/**
 * Created by Litvinenko on 09.01.2016.
 */
public class Directory {

    public Directory() {

    }

    public static void createDirectory(String directoryPath) throws IOException {
        File file = new File(directoryPath);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }
    }
}


