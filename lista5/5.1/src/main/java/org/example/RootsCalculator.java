package org.example;

import java.util.ArrayList;
import java.util.List;

public class RootsCalculator {
    public static List<Double> calculate_roots(double a, double b, double c) {
        List<Double> roots = new ArrayList<>();
        double inf = Double.POSITIVE_INFINITY; //w przypadku nieskończonej liczby rozwiązań

        if (a==0) { //parametry mogą być zerami
            if (b==0) {
                if (c==0) {
                    //przypadek 6: 0x² + 0x + 0 = 0 - nieskończenie wiele rozwiązań
                    roots.add(inf);
                }
                //przypadek 5: 0x² + 0x + c = 0 - brak rozwiązań
            } else {
                //przypadek 4: 0x² + bx + c = 0
                double root = (-c/b);
                roots.add(root);
            }
        } else {
            double delta = (b*b)-4*(a*c);

            if (delta>0) {
                //przypadek 1: dwa pierwiastki
                double root1 = (-b-Math.sqrt(delta))/(2*a);
                double root2 = (-b+Math.sqrt(delta))/(2*a);
                roots.add(root1);
                roots.add(root2);
            } else if (delta==0) {
                // Przypadek 2: jeden pierwiastek podwójny
                double root = (-b/(2*a));
                roots.add(root);
            }
            // Przypadek 3: delta<0 - brak pierwiastków rzeczywistych
        }

        return roots;
    }
}