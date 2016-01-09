/**
 * Created by Litvinenko on 06.01.2016.
 */
package file;

import java.io.File;
import java.io.IOException;

public class Text extends MyFile {


    public Text(){

    }
@Override
    public void createMyFile(String fileName) throws IOException {

    File file = new File(fileName);
    System.out.printf("File name is %s", fileName);
    if(!file.exists()){
        if(file.createNewFile()){
            System.out.printf("File with name %s was created", fileName);
        } else {
            System.out.printf("File with name %s is already created", fileName);
        }
    }

}
}
