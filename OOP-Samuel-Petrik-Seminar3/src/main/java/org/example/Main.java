package org.example;

import org.example.utility.ZKlavesnice;

public class Main {
    public static void main(String[] args) {
        Vozidlo bycikel = new Vozidlo("BMX", 2);
        Auto skodovka = new Auto("Skodovka", 4, "120Ls");

        bycikel.truba();
        skodovka.truba();
     }
}