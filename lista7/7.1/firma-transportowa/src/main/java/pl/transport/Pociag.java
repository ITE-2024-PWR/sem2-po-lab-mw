package pl.transport;

public class Pociag implements Interfejs {
    @Override
    public double obliczKoszt(double dystans) {
        return ((1.0/20)*dystans);
    }
}