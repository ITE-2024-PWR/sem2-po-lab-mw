package pl.transport;

public class Samolot implements Interfejs {
    @Override
    public double obliczKoszt(double dystans) {
        return ((1.0/100)*Math.pow(dystans, 2));
    }
}