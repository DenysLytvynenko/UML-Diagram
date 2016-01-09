import file.*;

import java.io.IOException;

/**
 * Created by Litvinenko on 09.01.2016.
 */
public class UMLDiagram {
    public static String filePath;
    public static String fileName;
    public static String fullFilePath;
    public static String text;
    public static void main (String[] args) throws IOException {
        filePath = args[0];
        System.out.printf("File path is: %s\n", filePath);
        fileName = args[1];
        System.out.printf("File name is: %s\n", fileName);
        //fullFilePath = filePath;
         text = args[3];
        StringBuffer sb = new StringBuffer();
        fullFilePath = sb.append(filePath).append("\\").append(fileName).toString();
        System.out.printf("Full file name is: %s\n", fullFilePath);
        if (args[2].equals("txt")){
            Directory dir = new Directory();
            dir.createDirectory(filePath);
            MyFile mFile = new Text();
            mFile.createMyFile(fullFilePath, text);
        } else {
            System.out.println("Unknown file extension");
        }

    }
}
