package pl.edu.pwr.addons;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class StringHtmlCleaner {
    public static String clean(String html) {
        Document document = Jsoup.parse(html);
        return document.text();
    }
}