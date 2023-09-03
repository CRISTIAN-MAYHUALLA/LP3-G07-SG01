package LP3_LAB03.EJER_02;

public class Principal {
    // Método principal para probar la clase Fecha.
    public static void main(String[] args) {
        // Crear una instancia de Fecha
        Fecha fecha1 = new Fecha();
        
        // Actividad 3: Leer una fecha desde el usuario
        fecha1.leer();
        System.out.println("Fecha ingresada: " + fecha1.corta());

        // Actividad 4: Verificar si el año de la fecha es bisiesto
        boolean esBisiesto = fecha1.bisiesto(0);
        System.out.println("¿Es bisiesto? " + esBisiesto);

        // Actividad 7: Accesores y mutadores
        fecha1.SetDia(15);
        fecha1.SetMes(6);
        fecha1.SetAnio(2023);
        System.out.println("Fecha modificada: " + fecha1.corta());

        // Actividad 9: Número de días transcurridos desde el 1-1-1900
        long diasTranscurridos = fecha1.diasTranscurridos();
        System.out.println("Días transcurridos: " + diasTranscurridos);

        // Actividad 10: Día de la semana
        int diaSemana = fecha1.diaSemana();
        System.out.println("Día de la semana: " + diaSemana);

        // Actividad 11: Fecha en formato largo
        String fechaLarga = fecha1.larga();
        System.out.println("Fecha larga: " + fechaLarga);

        // Actividad 12: Actualizar fecha agregando días
        fecha1.fechaTras(5);
        System.out.println("Fecha después de agregar 5 días: " + fecha1.corta());

        // Actividad 13: Número de días entre dos fechas
        Fecha fecha2 = new Fecha(1, 1, 2023);
        long diasEntre = fecha1.diasEntre(fecha2);
        System.out.println("Días entre las dos fechas: " + diasEntre);

        // Actividad 14: Pasar al día siguiente
        fecha1.siguiente();
        System.out.println("Fecha siguiente: " + fecha1.corta());

        // Actividad 15: Pasar al día anterior
        fecha1.anterior();
        System.out.println("Fecha anterior: " + fecha1.corta());

        // Actividad 16: Actualizar fecha futura agregando días
        fecha1.fechaFutura(10);
        System.out.println("Fecha futura después de agregar 10 días: " + fecha1.corta());

        // Actividad 17: Clonar una fecha
        Fecha copiaFecha = fecha1.copia();
        System.out.println("Copia de la fecha: " + copiaFecha.corta());

        // Actividad 18: Comparar si dos fechas son iguales
        boolean sonIguales = Fecha.igualQue(fecha1, copiaFecha);
        System.out.println("¿Son iguales? " + sonIguales);

        // Actividad 19: Comparar si una fecha es menor que otra
        boolean esMenor = Fecha.menorQue(fecha1, fecha2);
        System.out.println("¿Es fecha1 menor que fecha2? " + esMenor);

        // Actividad 20: Comparar si una fecha es mayor que otra
        boolean esMayor = Fecha.mayorQue(fecha1, fecha2);
        System.out.println("¿Es fecha1 mayor que fecha2? " + esMayor);
    }

}
