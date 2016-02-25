package ex_ua_loader;

import java.net.MalformedURLException;

/**
 * Created by dexter on 25.02.16.
 */
public class TestLoader {
    public static void main(String[] args) {
        Loader loader = new Loader();
        try {
            loader.load("11841246?r=82539,80936");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
