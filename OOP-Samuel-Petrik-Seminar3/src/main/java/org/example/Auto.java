package org.example;

public class Auto {
    public static final int PALIVO_NA_KM = 0.5; //static na konstanty
    private double stavNadrze;
    private double kapacitaNadrze;
    private boolean ojazdene;

    public Auto() {
        this(50,100);
    }

    public Auto(double stavNadrze, double kapacitaNadrze){
        this.stavNadrze = stavNadrze;
        this.kapacitaNadrze = kapacitaNadrze;
        this.ojazdene = true;
    }

    public void jazdi(double vzdialenostVKm){
        stavNadrze = stavNadrze - vzdialenostVKm * PALIVO_NA_KM;
        if(stavNadrze < 0) {
            stavNadrze = 0;
            System.out.println("Mame prazdnu nadrz");
        }
    }
    //getter
    public double getStavNadrze(){
        return stavNadrze;
    }
    //setter
    public void setStavNadrze(double stavNadrze){
        this.stavNadrze = stavNadrze;   //this odkazuje sam na seba
    }

    public double getKapacitaNadrze() {
        return kapacitaNadrze;
    }

    public void setKapacitaNadrze(double kapacitaNadrze) {
        this.kapacitaNadrze = kapacitaNadrze;
    }

    public boolean isOjazdene() {
        return ojazdene;
    }

    public void setOjazdene(boolean ojazdene) {
        this.ojazdene = ojazdene;
    }
}
