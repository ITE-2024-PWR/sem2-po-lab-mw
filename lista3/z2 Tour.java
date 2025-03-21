import java.util.*;

public class Tour {

    // nazwy państw wraz z ich stolicami
    public static void nazwystolice() {

        Map<String, String> panstwamiasta = new HashMap<>();
        panstwamiasta.put("Polska", "Warszawa");
        panstwamiasta.put("Portugalia", "Lizbona");
        panstwamiasta.put("Niemcy", "Berlin");
        panstwamiasta.put("Hiszpania", "Madryt");
        panstwamiasta.put("Francja", "Paryż");

        // wypisujemy państwa i ich stolice
        for (Map.Entry<String, String> entry : panstwamiasta.entrySet()) {
            System.out.println("Państwo: " + entry.getKey() + ", Stolica: " + entry.getValue());
        }

        // liczba elementow
        System.out.println("\nLiczba elementów w mapie: " + panstwamiasta.size());

        // czy mapa zawiera Szwecję
        if (panstwamiasta.containsKey("Szwecja")) {
            System.out.println("Zawiera Szwecję.");
        } else {
            System.out.println("Nie zawiera Szwecji.");
        }
    }

    // odwiedzone miasta podczas całej trasy wycieczki
    public static void odwiedzone() {

        List<String> odwiedzoneM = new ArrayList<>();
        odwiedzoneM.add("Warszawa");
        odwiedzoneM.add("Paryż");
        odwiedzoneM.add("Berlin");
        odwiedzoneM.add("Lizbona");
        odwiedzoneM.add("Paryż");
        odwiedzoneM.add("Madryt");

        // wypisujemy odwiedzone miasta
        System.out.println("\nOdwiedzone miasta:");
        for (String miasto : odwiedzoneM) {
            System.out.println(miasto);
        }

        // liczba elementow
        System.out.println("\nLiczba odwiedzonych miast w liście: " + odwiedzoneM.size());

        // czy lista zawiera Paryż
        if (odwiedzoneM.contains("Paryż")) {
            System.out.println("Lista odwiedzonych miast zawiera Paryż.");
        } else {
            System.out.println("Lista odwiedzonych miast nie zawiera Paryża.");
        }

    }

    // unikalne miasta
    public static void unikalne() {

        Set<String> unikalne = new HashSet<>();
        unikalne.add("Warszawa");
        unikalne.add("Paryż");
        unikalne.add("Berlin");
        unikalne.add("Lizbona");
        unikalne.add("Madryt");

        // wypisujemy unikalne miasta
        System.out.println("\nUnikalne miasta:");
        for (String miasto : unikalne) {
            System.out.println(miasto);
        }

        // liczba elementow
        System.out.println("\nLiczba unikalnych miast w zbiorze: " + unikalne.size());

        // czy zbiór zawiera Rzym
        if (unikalne.contains("Rzym")) {
            System.out.println("Zbiór unikalnych miast zawiera Rzym.");
        } else {
            System.out.println("Zbiór unikalnych miast nie zawiera Rzymu.");
        }
    }

    // metoda main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nazwy państw i ich stolice:");

        nazwystolice();

        odwiedzone();

        unikalne();

        in.close();
    }
}
