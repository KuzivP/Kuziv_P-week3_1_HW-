package ua.artcode.week2;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Олександр on 25.02.2016.
 */
public class TestScanner {
    public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(new FileReader("C:\\Users\\Олександр\\Desktop\\git_oleksandr_malov.txt"));
        scanner.useDelimiter(",");
        while (scanner.hasNext())
            System.out.println(scanner.next());
        scanner.close();

    }

}

