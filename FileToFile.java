import java.io.*;
public class FileToFile {
    public static void main(String[] args)throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        fis = new FileInputStream("abc.txt");
        fos = new FileOutputStream("abcd.txt");

        int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
 
            System.out.println("copied the file successfully");
            fis.close();
            fos.close();
        

 
        
    }
}
