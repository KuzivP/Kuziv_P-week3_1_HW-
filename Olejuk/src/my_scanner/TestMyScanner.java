package my_scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by dexter on 23.02.16.e
 */
public class TestMyScanner {

    public static void main(String[] args) {

        MyScanner scanner = new MyScanner(System.in);
        String str = scanner.next();
        if(str.equals("next next")){
            System.out.println("ok");
        }

    }

}
