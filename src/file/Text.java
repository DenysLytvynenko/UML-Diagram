/**
 * Created by Litvinenko on 06.01.2016.
 */
package file;

import java.io.*;

public class Text extends MyFile {


    public Text(){

    }
@Override
    public void createMyFile(String fileName, String text) throws IOException {

    File file = new File(fileName);
    System.out.printf("File name is %s\n", fileName);
    if(!file.exists()){
        if(file.createNewFile()){
            System.out.printf("File with name %s was created\n", fileName);
        } else {
            System.out.printf("File with name %s is already created\n", fileName);
        }
    } else {
        System.out.printf("File with name %s is already exist\n", fileName);
    }

    try
    {

        FileWriter fw = new FileWriter(fileName,true); //the true will append the new data
        StringBuffer sb = new StringBuffer();
        String fullText = sb.append(text).append("\n").toString();
        fw.write(fullText);//appends the string to the file
        fw.close();
    }
    catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }

}
}
