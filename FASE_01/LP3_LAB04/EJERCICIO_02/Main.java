package LP3_LAB04.EJERCICIO_02;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> sexos = new ArrayList<>();
        ArrayList<Integer> estadosLaborales = new ArrayList<>();
        ArrayList<Integer> sueldos = new ArrayList<>();

        Random random = new Random();

        System.out.println("Evaluación crediticia para 8 personas:");

        for (int i = 0; i < 8; i++) {
            int sexo = random.nextInt(2) + 1;
            sexos.add(sexo);

            int estadoLaboral = random.nextInt(2) + 1;
            estadosLaborales.add(estadoLaboral);

            int sueldo = 0;

            if (estadoLaboral == 1) {
                sueldo = random.nextInt(2051) + 950;
            }

            sueldos.add(sueldo);
        }

        // contadores para calcular los porcentajes
        int totalHombres = 0;
        int hombresTrabajadores = 0;
        int totalMujeres = 0;
        int mujeresTrabajadoras = 0;

        // suma de sueldos para promedios
        double sueldosHombres = 0.0;
        double sueldosMujeres = 0.0;

        for (int i = 0; i < 8; i++) {
            int sexo = sexos.get(i);
            int estadoLaboral = estadosLaborales.get(i);
            int sueldo = sueldos.get(i);

            if (sexo == 1) {
                totalHombres++;

                if (estadoLaboral == 1) {
                    hombresTrabajadores++;
                    sueldosHombres += sueldo;
                }
            } else {
                totalMujeres++;

                if (estadoLaboral == 1) {
                    mujeresTrabajadoras++;
                    sueldosMujeres += sueldo;
                }
            }
        }

        //porcentajes
        double porcentajeHombres = (double) totalHombres / 8 * 100;
        double porcentajeMujeres = (double) totalMujeres / 8 * 100;
        double porcentajeHombresTrabajadores = (double) hombresTrabajadores / totalHombres * 100;
        double porcentajeMujeresTrabajadoras = (double) mujeresTrabajadoras / totalMujeres * 100;

        // calculos de sueldo 
        double sueldoPromedioHombres = sueldosHombres / hombresTrabajadores;
        double sueldoPromedioMujeres = sueldosMujeres / mujeresTrabajadoras;

        System.out.println("Resultados de la evaluación:");
        System.out.println("a. Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("b. Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("c. Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajadores + "%");
        System.out.println("d. Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajadoras + "%");
        System.out.println("e. Sueldo promedio de hombres que trabajan: " + sueldoPromedioHombres);
        System.out.println("f. Sueldo promedio de mujeres que trabajan: " + sueldoPromedioMujeres);
    }
    
}
