package pl.company.employees;

public class Programista extends PracownikIT {
    public Programista(String imie, String nazwisko, double pensja, int lataDoswiadczenia) {
        super(imie, nazwisko, pensja, lataDoswiadczenia);
    }

    @Override
    public double Wynagrodzenie() {
        double premia = Premia();
        double premiaPoPodatku = (premia*0.915); //połowa podatku czyli 17/2=8.5 wiec 100-8.5=91,5
        double podstawaWynagrodzenia = getPensja();
        double wynagrodzeniePoPodatku = (podstawaWynagrodzenia*0.915); // połowa podatku czyli 17/2=8.5 wiec 100-8.5=91,5
        return (wynagrodzeniePoPodatku + premiaPoPodatku);
    }
}