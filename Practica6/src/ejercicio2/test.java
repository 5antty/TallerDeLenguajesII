package ejercicio2;

import ejercicio2.animal.PerroPeligroso;
import ejercicio2.animalespeligrosos.AnimalPeligroso;
import ejercicio2.domestico.PerroDomestico;

public class test {
    public void main(String args[]) {
        PerroDomestico gordo = new PerroPeligroso();
        PerroPeligroso gordo2 = (PerroPeligroso) gordo; // downcasting
        gordo2.ladra();
        gordo2.muevelacola();
        gordo2.muerde();

        AnimalPeligroso rita = new PerroPeligroso();
        PerroPeligroso rita2 = (PerroPeligroso) rita;
        rita2.muerde();
        rita2.ladra();
        rita2.muevelacola();
    }
}
