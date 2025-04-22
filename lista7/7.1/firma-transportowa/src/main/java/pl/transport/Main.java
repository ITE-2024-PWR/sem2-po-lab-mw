package pl.transport;

public class Main {
    public static void main(String[] args) {
        Interfejs samolot = new Samolot();
        Interfejs pociag = new Pociag();


        // Z.1
        Zyski z1 = new Zyski(200, 10);
        System.out.println("Z.1\nPociąg dystans - 200, wynagrodzenie - 10:\n " + z1.obliczZysk(pociag));

        // Z.2
        Zyski z2a = new Zyski(50, 50);
        Zyski z2b = new Zyski(30, 40);
        System.out.println("\nZ.2a\n Samolot dystans - 50, wynagrodzenie 50:\n " + z2a.obliczZysk(samolot));
        System.out.println("\nZ.2b\n Samolot dystans - 30, wynagrodzenie 40:\n " + z2b.obliczZysk(samolot));
        if(z2a.obliczZysk(samolot)>z2b.obliczZysk(samolot)) {
            System.out.println("\nOdp. Zlecenie 1 da większy zysk");
        } else System.out.println("\nOdp. Zlecenie 2 da większy zysk");

        // Z.3
        Zyski z3 = new Zyski(350, 45);
        System.out.println("\nZ.3\n Samolot dystans - 350, wynagrodzenie 45:\n " + z3.obliczZysk(samolot));
        System.out.println("\n Pociąg dystans - 350, wynagrodzenie 45:\n " + z3.obliczZysk(pociag));
        if(z3.obliczZysk(samolot)>z3.obliczZysk(pociag)) {
            System.out.println("\nOdp. Samolot da większy zysk");
        } else System.out.println("\nOdp. Pociąg da większy zysk");

    }
}