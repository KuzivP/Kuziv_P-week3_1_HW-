package my_scanner;

import java.io.*;
import java.util.Scanner;

/**
 * Created by dexter on 23.02.16.
 */
public class MyScanner implements Closeable{

    private Reader reader;

    public MyScanner(InputStream source){
            reader = new InputStreamReader(source);
    }

    public MyScanner(File fileName){

        try {
            reader = new InputStreamReader(new FileInputStream(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String nextLine(){

        char[] bArray = new char[1024];

        try {
            reader.read(bArray, 0, bArray.length);
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder str = new StringBuilder();
        str.append(bArray);

        return str.substring(0, str.indexOf("\n"));
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }

}
