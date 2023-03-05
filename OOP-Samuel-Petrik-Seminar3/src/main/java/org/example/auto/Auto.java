package org.example.auto;

public class Auto {
    private double stavNadrze;
    private double kapacitaNadrze;
    private boolean ojazdene;

    public void jazdi(double vzdialenostVKm){
        stavNadrze = stavNadrze - vzdialenostVKm * 0.5;
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
