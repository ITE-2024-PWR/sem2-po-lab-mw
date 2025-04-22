package pl.company.employees;

public class Main {
    public static void main(String[] args) {
        Pracownik[] pracownicy = {
                new Ksiegowy("Adam", "Wiśniewski", 6000),
                new PracownikIT("Agata", "Wróbel", 7500, 3),
                new PracownikIT("Paweł", "Kowalski", 5000, 1),
                new Programista("Ada", "Nowak", 8000, 6)
        };

        for (Pracownik pracownik : pracownicy) { //for (int i=0; i<pracownicy.length; i++)
            System.out.printf("%s %s: %.2f zł%n",
                    pracownik.getImie(),
                    pracownik.getNazwisko(),
                    pracownik.Wynagrodzenie()
            );
        }
    }
}