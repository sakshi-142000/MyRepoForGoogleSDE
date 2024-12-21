import java.io.FileReader;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args){
        try(FileReader fileReader = new FileReader("test.txt")){
            int data = fileReader.read();
            while(data != -1){
                System.out.print((char)data);
                data = fileReader.read();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
