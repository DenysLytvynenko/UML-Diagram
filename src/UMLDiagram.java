import file.*;

import java.io.IOException;

/**
 * Created by Litvinenko on 09.01.2016.
 */
public class UMLDiagram {
    public static String filePath;
    public static String fileName;
    public static String fullFilePath;
    public static void main (String[] args) throws IOException {
        filePath = args[0];
        System.out.printf("File path is: %s", filePath);
        fileName = args[1];
        System.out.printf("File name is: %s", fileName);
        fullFilePath = filePath;

        StringBuffer sb = new StringBuffer();
        fullFilePath = sb.append(fileName).toString();
        System.out.printf("Full file name is: %s", fullFilePath);
        if (args[2].equals("txt")){
            Directory dir = new Directory();
            dir.createDirectory(filePath);
            MyFile mFile = new Text();
            mFile.createMyFile(fullFilePath);
        } else {
            System.out.println("Unknown file extension");
        }

    }
}
