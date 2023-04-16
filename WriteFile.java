import java.util.*;
import java.io.*;

public class WriteFile {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner (System.in);
        File ob1 = new File ("abcd.txt");
        ob1.createNewFile();
        PrintWriter pw = new PrintWriter(ob1);
        for(int i=1; i<=5;i++){
            pw.println(sc.next());
        }

        pw.close();
        sc.close();


        
    }
    
}
