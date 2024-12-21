import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderClass {
    public static void main(String[] args){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            String string;
            while((string = bufferedReader.readLine())!= null){
                System.out.println(string);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
