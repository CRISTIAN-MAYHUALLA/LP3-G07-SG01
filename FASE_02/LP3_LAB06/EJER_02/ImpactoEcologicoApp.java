package FASE_02.LP3_LAB06.EJER_02;

import java.util.ArrayList;

public class ImpactoEcologicoApp {
    public static void main(String[] args) {
        // Crear objetos de las clases
        Edificio edificio = new Edificio(10000); // Consumo de energía en kWh por año
        Auto auto = new Auto(2.5); // Emisiones de CO2 en kg por año
        Bicicleta bicicleta = new Bicicleta(5000); // Distancia recorrida en km por año

        // Crear un ArrayList de objetos ImpactoEcologico
        ArrayList<ImpactoEcologico> impactoEcologicoList = new ArrayList<>();
        impactoEcologicoList.add(edificio);
        impactoEcologicoList.add(auto);
        impactoEcologicoList.add(bicicleta);

        // Iterar a través de la lista y mostrar el impacto ecológico
        for (ImpactoEcologico objeto : impactoEcologicoList) {
            if (objeto instanceof Edificio) {
                System.out.println("Edificio - Impacto Ecológico: " + objeto.obtenerImpactoEcologico() + " GEI");
            } else if (objeto instanceof Auto) {
                System.out.println("Auto - Impacto Ecológico: " + objeto.obtenerImpactoEcologico() + " GEI");
            } else if (objeto instanceof Bicicleta) {
                System.out.println("Bicicleta - Impacto Ecológico: " + objeto.obtenerImpactoEcologico() + " GEI");
            }
        }
    }
}
