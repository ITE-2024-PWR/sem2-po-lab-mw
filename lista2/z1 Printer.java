import java.util.Scanner;

public class Printer {

    // definicja publicznej, statycznej metody wypisującej liczby parzyste z zakresu [0; N]
    public static void parzyste(int N) {
        for (int i=0; i<=N; i++){
            if (i%2==0) { // sprawdzenie, czy liczba jest parzysta
                System.out.print(i + " "); // wypisanie liczby parzystej
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Wpisz liczbe: ");
        int N = in.nextInt();

        parzyste(N); //wywolanie metody
    }
}
