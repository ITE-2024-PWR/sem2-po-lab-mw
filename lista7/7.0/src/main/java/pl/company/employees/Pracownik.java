package pl.company.employees;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, double pensja) {
        this.imie = imie; // this.imie = pole klasy, imie = parametr
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }

    public double Wynagrodzenie() {
        return (pensja*0.83); // 17% podatku wiec 100-17=83
    }

    // gettery
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getPensja() {
        return pensja;
    }
}