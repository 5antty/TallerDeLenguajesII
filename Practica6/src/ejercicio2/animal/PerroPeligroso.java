package ejercicio2.animal;

import ejercicio2.domestico.PerroDomestico;
import ejercicio2.animalespeligrosos.AnimalPeligroso;

public class PerroPeligroso implements AnimalPeligroso, PerroDomestico {
    public void muerde() {
        System.out.println("GRRR!");
    }

    public void ladra() {
        System.out.println("GUAU GUAU!");
    }

    public void muevelacola() {
        System.out.println("Mueve la cola");
    }
}
