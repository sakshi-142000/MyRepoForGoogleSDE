import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;


public class fileWriterAppendMode {
    public static void main(String[] args){
        try (FileWriter fw = new FileWriter("test.txt", true)){
            fw.write("Hellow, using the append attribute \n");
            fw.close();


            FileReader fr = new FileReader("test.txt");
            int data = fr.read();
            while(data!=-1){
                System.out.print((char)data);
                data=fr.read();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
