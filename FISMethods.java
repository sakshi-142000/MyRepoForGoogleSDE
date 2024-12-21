import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;


public class FISMethods {
    public static void main(String[] args){
        FISMethods obj = new FISMethods();
        obj.ReadMethod();
        obj.ReadMethod2();
    }

    public void ReadMethod(){
        // demonstrating the use of read(Bytes[] b) method
        File file = new File("test.txt");
        try(FileInputStream fis = new FileInputStream(file)){
            byte[] barray = new byte[20]; // byte array of size 20
            int numberOfBytesRead = fis.read(barray);
            while(numberOfBytesRead!=-1){
                System.out.write(barray, 0, numberOfBytesRead);
                numberOfBytesRead=fis.read(barray);
            }
            fis.close();
        } catch(IOException e){
            System.out.println(e.toString());
        }
    }

    public void ReadMethod2(){
        String fileName = "test.txt";
        try(FileInputStream fis = new FileInputStream(fileName)) {
            byte[] barray = new byte [2];// byte array of size 2
            //plese note that byte and Byte are different
            fis.skip(5);
            //int bytesReturned = fis.read(barray, 0, 2);
            while((fis.read(barray,0,2))!=-1){
                System.out.write(barray,0,2);
            }
            fis.close();
            
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
