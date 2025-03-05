import java.util.Scanner;

//z.1
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world!");

//z.2
        squared();
    }

    public static void squared(){
        Scanner in = new Scanner(System.in);

        System.out.print("Wpisz liczbe: ");
        int liczba = in.nextInt();
        int wynik = liczba*liczba;

        System.out.println("Kwadrat podanej liczby: " + wynik);
    }
}