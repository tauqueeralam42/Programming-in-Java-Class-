import java.io.*;
public class FileAllMethods {
    public static void main(String[] args) throws IOException {
        File f = new File ("abc.txt");
        f.createNewFile();
        System.out.println("==============================");
        System.out.println("List of Various Methods work with File: \n\n");
        System.out.println("File name :" +f.getName());
        System.out.println("Path: " +f.getPath());
        System.out.println("lastModified: " +new java.util.Date(f.lastModified()));
        System.out.println("Canonical path: " +f.getCanonicalPath());
        System.out.println("Parents: " +f.getParent());
        System.out.println("Exits :" +f.exists());
        if(f.exists())
        {
            System.out.println("Is writeable:" +f.canWrite());
            System.out.println("Is readable:" +f.canRead());
            System.out.println("Is a directory:"+f.isDirectory());
            System.out.println("Is a File:" +f.isFile());
            System.out.println("File Size in bytes " +f.length());
        }
    }
    
}
