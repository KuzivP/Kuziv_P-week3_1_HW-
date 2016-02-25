package ex_ua_loader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.List;

/**
 * Created by dexter on 25.02.16.
 */
public class Loader {
    public void load(String path) throws Exception {
        URL url = new URL("http://www.ex.ua/" + path);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        int responseCode = con.getResponseCode();
        System.out.println("Response Code : " + responseCode);

        StringBuilder content = new StringBuilder();
        char[] chars = new char[1024];
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        while(reader.read(chars, 0, chars.length) == 1024){
            content.append(chars);
            Thread.sleep(100);
        }

        con.disconnect();

        Document html = Jsoup.parse(content.toString());
        List<String> imgPathes = new ArrayList<>();


        Elements elements = html.select("img");

        for(Element tmp : elements){
            imgPathes.add(tmp.attr("src"));
        }

        List<String> validSrc = new ArrayList<>();
        for(String tmp : imgPathes){
            if(tmp.startsWith("http")){
                validSrc.add(tmp);
            }
        }

        System.out.println(validSrc.size());

        BufferedImage img;
        int numberImage = 1;
        for(String tmp : validSrc){
            try{
                url = new URL(tmp);
                img = ImageIO.read(url);
                if (img != null){
                    // for jpg
                    ImageIO.write(img, "jpg",new File("/home/dexter/Pictures/pictures" + numberImage++));
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
