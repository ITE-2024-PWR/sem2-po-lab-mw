package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Magazyn {
    public static void main(String[] args) {
        Produkt zly = new Produkt();
        Produkt dobry = new Produkt("Dobry", 200, new DataProdukcji((byte) 1, (byte) 1, 2026));
        Produkt kopia = new Produkt(dobry);

        zly.print();
        dobry.print();
        kopia.print();

        Produkt[] tab = new Produkt[3];
        try {
            tab[0].print();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        Arrays.fill(tab, new Produkt());
        tab[0].print();

        ArrayList<Produkt> list = new ArrayList<>();
        list.add(new Produkt());
        list.add(new Produkt( "Sok", 100, new DataProdukcji((byte) 1, (byte) 1, 2026)));
        list.add(new Produkt(list.get(1)));
        for(Produkt item : list) item.print();

        System.out.println("Liczba utworzonych obiektów: " + Produkt.getCount());
    }
}