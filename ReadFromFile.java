import java.util.*;
import java.io.*;

public class ReadFromFile {
    public static void main(String[] args)throws IOException {
        File ob1 = new File ("abc.txt");
       // f.createNewFile();

        // BufferedReader br = new BufferedReader(new FileReader(f));
 
        
        // String st;
        // while ((st = br.readLine()) != null)
        //     System.out.println(st);

        PrintWriter pw = new PrintWriter(System.out);
        Scanner sc1 = new Scanner(ob1);
        while(sc1.hasNext()){
            pw.println(sc1.next());
        }

        pw.close();
        sc1.close();
  }
}
    

