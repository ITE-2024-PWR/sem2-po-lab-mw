import java.util.Scanner;

public class Fib {

    // metoda iteracyjna
    public static int iteracyjna(int n) {
        if (n<=1){
            return n;  //fib(0)=0, fib(1)=1
        }

        int a=0, b=1;  // pierwsze dwa wyrazy ciągu
        for (int i=2; i<=n; i++) {
            int tmp=a+b;
            a=b;
            b=tmp;
        }
        return b;
    }

    // metoda rekurencyjna
    public static int rekurencyjna(int n) {
        if (n<=1){
            return n;  // fib(0)=0, fib(1)=1
        }
        return rekurencyjna(n-1) + rekurencyjna(n-2);  // rekurencyjne wywołanie
    }

    // metoda main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Wpisz liczbe: ");
        int n = in.nextInt();

        // wywołanie metody iteracyjnej
        System.out.print("Fibonacci (iteracyjnie) dla n = " + n + ": " + iteracyjna(n));

        // wywołanie metody rekurencyjnej
        System.out.print("\nFibonacci (rekurencyjnie) dla n = " + n + ": " + rekurencyjna(n));
    }
}
