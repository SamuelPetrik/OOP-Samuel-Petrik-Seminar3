package org.example;

import org.example.auto.Auto;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto();    //new vytvarame nove objekty,..
        a.setKapacitaNadrze(100);
        a.setStavNadrze(100);

        System.out.println(a.getStavNadrze());
        a.jazdi(100);
        System.out.println(a.getStavNadrze());
    }
}