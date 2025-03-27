package pl.edu.pwr.app;

import pl.edu.pwr.addons.PageDownloadingUtility;
import pl.edu.pwr.addons.StringHtmlCleaner;

public class Application {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        for (String arg : args) {
            String url = args[0];
            String html = PageDownloadingUtility.download(url);
            String cleanText = StringHtmlCleaner.clean(html);
            System.out.println(cleanText);
        }

    }
}