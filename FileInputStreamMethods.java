import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamMethods{

    public static void main(String[] args){
        File file = new File("test.txt");
        try(FileInputStream fileInputStream = new FileInputStream(file)){
            int data;
            while((data = fileInputStream.read())!=-1){
                System.out.print((char)data);//type casting to char
            }

            //second method is reading to byte array per the length of array

            byte[] b = new byte[1024]; 
            int numberOfBytesRead = fileInputStream.read(b); // this read function takes byte array as input and returns the number of bytes read else -1 for EOf
            while (numberOfBytesRead!=-1){
                System.out.write(b,0,numberOfBytesRead); 
                numberOfBytesRead=fileInputStream.read(b);
            }

        }catch(IOException e){
            System.out.println(e.toString());
        }
    }
}
