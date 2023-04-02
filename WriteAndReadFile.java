package write.and.read.file;

import java.util.*;
import java.io.*;

public class WriteAndReadFile {

    public static void main(String[] args)throws IOException {
        File file = new File("writeandread.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("hello");
        pw.close();
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(file);
        System.out.println(scan.nextLine());
        pw.close();
    }
    
}
