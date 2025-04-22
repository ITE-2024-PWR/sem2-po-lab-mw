import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FeaturesCalculator {
    private ArrayList<ArrayList<Integer>> binary_mask;
    private Integer[] mass_center;
    private String filename;

    public FeaturesCalculator(String filename) {
        this.filename = filename;
        this.binary_mask = new ArrayList<>();
        this.mass_center = new Integer[2];
    }

    public void read_data() {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                ArrayList<Integer> row = new ArrayList<>();
                Scanner lineScanner = new Scanner(line);
                while (lineScanner.hasNextInt()) {
                    row.add(lineScanner.nextInt());
                }
                binary_mask.add(row);
                lineScanner.close();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku.");
        }
    }

    public void calculate_mass_center() {
        int sumX=0, sumY=0, count=0;
        for (int y=0; y<binary_mask.size(); y++) {
            ArrayList<Integer> row = binary_mask.get(y);
            for (int x=0; x<row.size(); x++) {
                if (row.get(x)!=0) {
                    sumX+=x;
                    sumY+=y;
                    count++;
                }
            }
        }
        if (count>0) {
            mass_center[0] = (sumX/count);
            mass_center[1] = (sumY/count);
        } else {
            mass_center[0] = 0;
            mass_center[1] = 0;
        }
    }

    public void save_results() {
        String outputFilename = filename.replace(".txt", " out.txt");
        try {
            PrintWriter writer = new PrintWriter(outputFilename);

            for (int y=0; y<binary_mask.size(); y++) {
                ArrayList<Integer> row = binary_mask.get(y);
                for (int x=0; x<row.size(); x++) {
                    if (x==mass_center[0] && y==mass_center[1]) {
                        writer.print("P ");
                    } else {
                        writer.print(row.get(x) + " ");
                    }
                }
                writer.println();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie można zapisać pliku.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku: ");
        String filename = scanner.nextLine();

        FeaturesCalculator calculator = new FeaturesCalculator(filename);
        calculator.read_data();
        calculator.calculate_mass_center();
        calculator.save_results();

        System.out.println("Obliczenia zakończone. Wynik zapisano w pliku.");
    }
}