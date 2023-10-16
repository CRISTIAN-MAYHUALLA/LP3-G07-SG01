package FASE_02.LP3_LAB06.EJER_02;

// Interfaz ImpactoEcologico con el método obtenerImpactoEcologico
interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

// Clase Edificio que implementa la interfaz ImpactoEcologico
class Edificio implements ImpactoEcologico {
    private double consumoEnergia; // Consumo de energía del edificio en kWh por año

    public Edificio(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para calcular el DATO_ACTIVIDAD
        double datoActividad = consumoEnergia * 0.5;
        // FACTOR_DE_EMISION ficticio para edificios
        double factorEmision = 0.7;
        // Cálculo del IMPACTO_ECOLOGICO
        return datoActividad * factorEmision;
    }
}

// Clase Auto que implementa la interfaz ImpactoEcologico
class Auto implements ImpactoEcologico {
    private double emisionCO2; // Emisiones de CO2 del auto en kg por año

    public Auto(double emisionCO2) {
        this.emisionCO2 = emisionCO2;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para calcular el DATO_ACTIVIDAD
        double datoActividad = emisionCO2 * 100;
        // FACTOR_DE_EMISION ficticio para autos
        double factorEmision = 0.3;
        // Cálculo del IMPACTO_ECOLOGICO
        return datoActividad * factorEmision;
    }
}

// Clase Bicicleta que implementa la interfaz ImpactoEcologico
class Bicicleta implements ImpactoEcologico {
    private int distanciaRecorrida; // Distancia recorrida en bicicleta en km por año

    public Bicicleta(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para calcular el DATO_ACTIVIDAD
        double datoActividad = distanciaRecorrida;
        // FACTOR_DE_EMISION ficticio para bicicletas
        double factorEmision = 0.05; // Las bicicletas no emiten CO2
        // Cálculo del IMPACTO_ECOLOGICO
        return datoActividad * factorEmision;
    }
}
