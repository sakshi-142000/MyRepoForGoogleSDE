import java.io.FileReader;
import java.io.IOException;

public class FIleReader2 {

    public static void main(String[] args){
        try {
            String fileName = "test.txt";
            FileReader fileReader = new FileReader(fileName);
            char[] carray = new char[255];
            int charRead = fileReader.read(carray);
            while(charRead!=-1){
                //System.out.print(carray.toString()); // this is wrong this, toString() method here will give the hashcode instead.
                System.out.print(new String(carray, 0, charRead));
                charRead= fileReader.read(carray);
            }
            fileReader.close();      
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
