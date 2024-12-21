import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class WriterClass {

    public static void main(String[] args){
        try {

            FileWriter fileWriter = new FileWriter("test.txt");// default mode of filewriter is overwrite, therefore, the previous contents of file will get overwritten
            fileWriter.write("Hello, I am writing this using the FileWriter class methods ");
            fileWriter.close();// if you do not close the fileWriter, the file will get overwritten again and whatever you wrote before will get erased.

            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            String string = bufferedReader.readLine();
            while(string!=null){
                System.out.print(string);
                string = bufferedReader.readLine();
            }

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
