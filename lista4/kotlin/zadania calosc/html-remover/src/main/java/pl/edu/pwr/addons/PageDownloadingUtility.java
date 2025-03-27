package pl.edu.pwr.addons;

import org.jsoup.Jsoup;
import java.io.IOException;

public class PageDownloadingUtility {

    // Prywatny konstruktor, aby uniemożliwić tworzenie instancji tej klasy
    private PageDownloadingUtility() {
    }

    // Statyczna metoda do pobierania zawartości HTML strony
    public static String download(String url) {
        try {
            // Użycie Jsoup do połączenia z URL i pobrania HTML
            return Jsoup.connect(url).get().html();
        } catch (IOException e) {
            // Rzucenie RuntimeException, jeśli wystąpi błąd przy pobieraniu strony
            throw new RuntimeException(e);
        }
    }
}
