package pl.transport;

public class Zyski { //pola klasy
    private final double dystans;
    private final double wynagrodzenie;

    public Zyski(double dystans, double wynagrodzenie) { //przyjmuje parametry dystans i wynagrodzenie
        this.dystans = dystans;
        this.wynagrodzenie = wynagrodzenie;
    }

    public double obliczZysk(Interfejs srodekTransportu) {
        return (wynagrodzenie-srodekTransportu.obliczKoszt(dystans));
    }

    public double getDystans() {
        return dystans;
    }
    public double getWynagrodzenie() {
        return wynagrodzenie;
    }
}