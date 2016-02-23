package my_scanner;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Created by dexter on 23.02.16.e
 */
public class TestMyScanner {

    @Test
    public void testNextLine() throws Exception{
        MyScanner scanner = new MyScanner(new File("./resources/nextLineTestFile.txt"));
        Assert.assertEquals("nextLine test file", scanner.nextLine());
    }

    @Test
    public void testNext() throws Exception{
        MyScanner scanner = new MyScanner(new File("./resources/nextLineTestFile.txt"));
        Assert.assertEquals("nextLine", scanner.next());
    }

    @Test
    public void testNextInt() throws Exception{
        MyScanner scanner = new MyScanner(new File("./resources/nextIntTestFile.txt"));
        Assert.assertEquals(123, scanner.nextInt());
    }

}
