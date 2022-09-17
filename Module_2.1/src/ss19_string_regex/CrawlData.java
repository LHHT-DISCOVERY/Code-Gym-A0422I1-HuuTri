package ss19_string_regex;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CrawlData {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://baomoi.com/xe-co.epi");
            //open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            //close scananer
            scanner.close();
//            content = content.replaceAll("Báo điện tử Dân trí - Tin tức cập nhật liên tục 24/7", "");
            content = content.replaceAll("&#34;", "'");
            //regex

            Pattern p = Pattern.compile("alt=\"(.*?)\"");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Erorr : " + e.getMessage());
        }
    }
}
