package org.example;

import org.example.utility.KeyboardInput;
import org.example.utility.ZKlavesnice;

public class Main {
    public static void main(String[] args) {
        String meno1 = ZKlavesnice.readString("Zadaj meno");
        System.out.println("Nacitane Meno : " + meno1);
        System.out.println("-----------------------------");
        double cislo = KeyboardInput.readDouble("Zadaj meno pre druhu triedu:", 1);
        System.out.println("Nacitane druhe meno: " + cislo);
    }
}