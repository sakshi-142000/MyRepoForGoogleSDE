// this program is for demonstrating the use of FileInputStream class and its methods in java

import java.io.FileInputStream; // importing the FileInputStream class from java.io package
import java.io.IOException;

public class readFileInputStream{

    public static void main(String[] args){
        try(FileInputStream fileInputStream = new FileInputStream("test.txt")){
            int data; 
            while ((data = fileInputStream.read())!=-1){
                System.out.print((char)data);
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}