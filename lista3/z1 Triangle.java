import java.util.Scanner;

public class Triangle {

    public static void print_triangle(int n) {
        int[][] triangle = new int[n][n];

        // wypełniamy trójkąt Pascala
        for (int i=0; i<n; i++) {
            // ustawiamy pierwszy i ostatni element w wierszu na 1
            triangle[i][0]=1;
            triangle[i][i]=1;

            // wypełniamy resztę elementów (dla każdego wiersza)
            for (int j=1; j<i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        // wypisujemy trójkąt Pascala
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (triangle[i][j]!=0) {
                    System.out.print(triangle[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy trójkąta Pascala: ");
        int n = scanner.nextInt();

        print_triangle(n);

        scanner.close();
    }
}
