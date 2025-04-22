package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //przypadek 1 - dwa pierwiastki
        List<Double> roots1 = RootsCalculator.calculate_roots(1, -5, -6);
        System.out.println("Przypadek 1 (a=1, b=-5, c=-6): " + roots1);

        //przypadek 2 - jeden pierwiastek
        List<Double> roots2 = RootsCalculator.calculate_roots(1, -4, 4);
        System.out.println("Przypadek 2 (a=1, b=-4, c=4): " + roots2);

        //przypadek 3 - brak pierwiastków
        List<Double> roots3 = RootsCalculator.calculate_roots(1, 1, 6);
        System.out.println("Przypadek 3 (a=1, b=1, c=6): " + roots3);

        //przypadek 4 -  a=0, b≠0
        List<Double> roots4 = RootsCalculator.calculate_roots(0, 1, 6);
        System.out.println("Przypadek 4 (a=0, b=1, c=6): " + roots4);

        //przypadek 5 - a=0, b=0, c≠0 (brak rozwiązań)
        List<Double> roots5 = RootsCalculator.calculate_roots(0, 0, 7);
        System.out.println("Przypadek 5 (a=0, b=0, c=7): " + roots5);

        //przypadek 6 - a=0, b=0, c=0 (nieskończenie wiele rozwiązań)
        List<Double> roots6 = RootsCalculator.calculate_roots(0, 0, 0);
        System.out.println("Przypadek 6 (a=0, b=0, c=0): " + roots6);
    }
}