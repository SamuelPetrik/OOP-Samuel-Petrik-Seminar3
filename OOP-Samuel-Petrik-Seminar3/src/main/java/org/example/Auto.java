package org.example;

import java.util.Random;
import java.util.Scanner;
public class Auto extends Vozidlo{
    protected String nazovModelu;

    public Auto(String znacka, int pocetKolies, String nazovModelu) {
        super(znacka, pocetKolies); //zavolam super - vola konstruktor rodicoskej triedy
    }

    @Override
    public void truba() {
        System.out.println("TUtutututu");
    }
}

