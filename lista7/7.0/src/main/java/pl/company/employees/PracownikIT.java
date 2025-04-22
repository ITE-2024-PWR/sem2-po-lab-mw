package pl.company.employees;

public class PracownikIT extends Pracownik {
    private int lataDoswiadczenia; //premia jest zalezna od doswiadczenia

    public PracownikIT(String imie, String nazwisko, double pensja, int lataDoswiadczenia) {
        super(imie, nazwisko, pensja);
        this.lataDoswiadczenia = lataDoswiadczenia;
    }

    @Override
    public double Wynagrodzenie() {
        double premia = Premia();
        double premiaPoPodatku = (premia*0.83); // 17% wiec 100-17=83
        return super.Wynagrodzenie() + premiaPoPodatku;
    }

    protected double Premia() { //dostep dla podklas
        if (lataDoswiadczenia<2) {
            return 500;
        } else if (lataDoswiadczenia<5) {
            return 2000;
        } else {
            return 5000;
        }
    }
}