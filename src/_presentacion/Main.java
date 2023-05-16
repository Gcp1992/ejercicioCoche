package _presentacion;

import _modelo.Coche;
import _modelo.Conductor;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Coche
        Coche coche = new Coche(100);

        // Crear instancia de Conductor pasando el coche como argumento
        Conductor conductor = new Conductor(coche);

        // Llamar al método conducir del conductor
        conductor.conducir();
    }
}