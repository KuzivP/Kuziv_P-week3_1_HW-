package my_scanner;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dexter on 23.02.16.
 */
public class MyScanner implements Closeable{

    private InputStreamReader reader;

    public MyScanner(InputStream source){
            reader = new InputStreamReader(source);
    }

    public String next(){

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
