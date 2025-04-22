package pl.company.employees;

public class Ksiegowy extends Pracownik {
    public Ksiegowy(String imie, String nazwisko, double pensja) {
        super(imie, nazwisko, pensja); //Wywołanie konstruktora Pracownik (klasy matki) tzn przekazuje parametry imie itd do konstruktora matki
    }

    @Override //Oznacza, że ta metoda nadpisuje metodę z Pracownik
    public double Wynagrodzenie() {
        double premia = (getPensja()*0.10); // 10% premii
        double premiaPoPodatku = (premia*0.83); // 17% wiec 100-17=83
        return super.Wynagrodzenie() + premiaPoPodatku;
    }
}