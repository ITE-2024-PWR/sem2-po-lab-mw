package org.example;

public class Produkt {
    private static int countStatic_ = 0;
    // public int countNonStatic_ = 0;

    // public static int idStatic_ = 0;
    private final int idNonStatic_;
    private final String name;
    public int price;

    private DataProdukcji dataWaznosci;

     //Konstruktor domyślny - ustala wartości na błędne
    public Produkt() {
        this.idNonStatic_ = ++countStatic_;
        this.name = "ERROR";
        this.price = 0;
        this.dataWaznosci = new DataProdukcji((byte) 0, (byte) 0, 0);
    }

    /**
     Konstruktor z parametrami
     @param name
     @param price z częścią dziesiętną (wartość razy 100)
     */

    public Produkt(String name, int price, DataProdukcji dataWaznosci) {
        this.idNonStatic_ = ++countStatic_;
        this.name = name;
        this.price = price;
        this.dataWaznosci = dataWaznosci;
    }


    /**
     Konstruktor kopiujący
     @param item obiekt kopiowany
     */

    public Produkt(Produkt item) {
        this.idNonStatic_ = ++countStatic_;
        this.name = item.name;
        this.price = item.price;
        this.dataWaznosci = item.dataWaznosci;
    }

    public void print() {
        System.out.printf(
                "ID Produktu: %d\nNazwa: %s\nCena: %d.%d\nData ważności: %d.%d.%d\n_________\n",
                idNonStatic_,
                name,
                price,
                price % 100,
                dataWaznosci.day,
                dataWaznosci.month,
                dataWaznosci.year
        );
    }

    public static int getCount() {
        return Produkt.countStatic_;
    }

}
