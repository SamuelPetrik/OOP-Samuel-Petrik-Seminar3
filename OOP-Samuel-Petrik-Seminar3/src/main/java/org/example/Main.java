package org.example;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto(100,100);    //new vytvarame nove objekty,..

        System.out.println(a.getStavNadrze());
        a.jazdi(100);
        System.out.println(a.getStavNadrze());
    }
}