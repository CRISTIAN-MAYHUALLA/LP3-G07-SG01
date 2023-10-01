package LP3_LAB03.EJER_02;
import java.util.Scanner;

public class Fecha {
        private int dia;
        private int mes;
        private int anio;
    
        // Actividad 1: Constructor predeterminado con 1-1-1900 como fecha por defecto.
        public Fecha() {
            this.dia = 1;
            this.mes = 1;
            this.anio = 1900;
        }
    
        // Actividad 2: Constructor parametrizado con día, mes y año.
        public Fecha(int dia, int mes, int anio) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
            valida(); // Actividad 6: Llamamos al método valida para asegurarnos de que la fecha sea correcta.
        }
    
        // Actividad 3: Método para leer una fecha desde el usuario.
        public void leer() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el día (1 a 31): ");
            dia = scanner.nextInt();
            System.out.print("Ingrese el mes (1 a 12): ");
            mes = scanner.nextInt();
            System.out.print("Ingrese el año (1900 a 2050): ");
            anio = scanner.nextInt();
            valida(); // Actividad 6: Llamamos al método valida para asegurarnos de que la fecha sea correcta.
            scanner.close();
        }
    
        // Actividad 4: Método para indicar si el año de la fecha es bisiesto o no.
        public boolean bisiesto(int year) {
            return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        }
    
        // Actividad 5: Método para devolver el número de días del mes que se le indique.
        public int diasMes(int mes) {
            int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            if (mes == 2 && bisiesto(mes)) {
                return 29;
            }
            return diasPorMes[mes - 1];
        }
    
        // Actividad 6: Método auxiliar privado para validar la fecha.
        private void valida() {
            if (anio < 1900 || anio > 2050) {
                anio = 1900;
            }
            if (mes < 1 || mes > 12) {
                mes = 1;
            }
            int maxDias = diasMes(mes);
            if (dia < 1 || dia > maxDias) {
                dia = 1;
            }
        }
    
        // Actividad 7: Accesores y mutadores.
        public void SetDia(int dia){
            this.dia=dia;
        }
        public int getDia(){
            return dia;
        }
         public void SetMes(int dia){
            this.mes=mes;
        }
        public int getMes(){
            return mes;
        }
         public void SetAnio(int dia){
            this.anio=anio;
        }
        public int getAnio(){
            return anio;
        }
    
        // Actividad 8: Método para mostrar la fecha en formato corto (02-09-2003).
        public String corta() {
            return String.format("%02d-%02d-%04d", dia, mes, anio);
        }
    
        // Actividad 9: Método para devolver el número de días transcurridos desde el 1-1-1900 hasta la fecha.
        public long diasTranscurridos() {
            long diasTotales = 0;
            for (int year = 1900; year < this.anio; year++) {
                if (bisiesto(year)) {
                    diasTotales += 366;
                } else {
                    diasTotales += 365;
                }
            }
            for (int month = 1; month < this.mes; month++) {
                diasTotales += diasMes(month);
            }
            diasTotales += this.dia - 1;
            return diasTotales;
        }
        
        // Actividad 10: Método para devolver el día de la semana de la fecha (0 para domingo, ..., 6 para sábado).
        public int diaSemana() {
            int q = this.dia;
            int m = this.mes;
            int y = this.anio;
            if (m < 3) {
                m += 12;
                y--;
            }
            int K = y % 100;
            int J = y / 100;
            int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) - 2 * J) % 7;
            return (h + 5) % 7; // Ajuste para que 0 sea domingo, 1 sea lunes, etc.
        }
    
        // Actividad 11: Método para mostrar la fecha en formato largo, empezando por el día de la semana (martes 2 de septiembre de 2003).
        public String larga() {
            String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
            String nombreDia = diasSemana[diaSemana()];
            return nombreDia + " " + this.dia + " de " + nombreMes(this.mes) + " de " + this.anio;
        }
        
        private String nombreMes(int mes) {
            String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
            return nombresMeses[mes - 1];
        }
    
        // Actividad 12: Método para actualizar la fecha agregando los días que se indiquen desde el 1-1-1900.
        public void fechaTras(long dias) {
            long totalDias = diasTranscurridos() + dias;
        
            // Calcula años completos y ajusta la fecha
            while (totalDias >= 365) {
                if (bisiesto(anio)) {
                    if (totalDias >= 366) {
                        totalDias -= 366;
                        anio++;
                    } else {
                        break;
                    }
                } else {
                    totalDias -= 365;
                    anio++;
                }
            }
        
            // Calcula el mes y el día
            int mesActual = mes;
            while (totalDias > 0) {
                int diasEnMes = diasMes(mesActual);
                if (totalDias >= diasEnMes) {
                    totalDias -= diasEnMes;
                    mesActual++;
                    if (mesActual > 12) {
                        mesActual = 1;
                        anio++;
                    }
                } else {
                    dia = (int) totalDias + 1;
                    mes = mesActual;
                    break;
                }
            }
        }
    //actividad 13:
        public long diasEntre(Fecha otraFecha) {
            long diasActual = this.diasTranscurridos();
            long diasOtraFecha = otraFecha.diasTranscurridos();
            
            // Calcula la diferencia de días entre las dos fechas
            long diferenciaDias = diasActual - diasOtraFecha;
        
            // Devuelve el valor absoluto de la diferencia para asegurarse de que sea positivo
            return Math.abs(diferenciaDias);
        }
    //actividad 14:
        public void siguiente() {
        int maxDiasEnMes = diasMes(mes);
        
        if (dia < maxDiasEnMes) {
            dia++;
        } else {
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                anio++;
            }
            dia = 1;
        }
    }
    
        // Actividad 15: Método para pasar al día anterior.
        public void anterior() {
            if (dia > 1) {
                dia--;
            } else {
                if (mes > 1) {
                    mes--;
                    dia = diasMes(mes);
                } else {
                    mes = 12;
                    dia = 31;
                    anio--;
                }
            }
        }
        
    
        // Actividad 17: Método para devolver un clon de la fecha.
        public Fecha copia() {
            return new Fecha(this.dia, this.mes, this.anio);
        }
    
        // Actividad 18: Método de clase para verificar si dos fechas son iguales.
        public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
            return fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio;
        }
    
        // Actividad 19: Método de clase para verificar si una fecha es menor que otra.
        public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
            if (fecha1.anio < fecha2.anio) {
                return true;
            } else if (fecha1.anio == fecha2.anio) {
                if (fecha1.mes < fecha2.mes) {
                    return true;
                } else if (fecha1.mes == fecha2.mes) {
                    return fecha1.dia < fecha2.dia;
                }
            }
            return false;
        }
    
        // Actividad 20: Método de clase para verificar si una fecha es mayor que otra.
        public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
            if (fecha1.anio > fecha2.anio) {
                return true;
            } else if (fecha1.anio == fecha2.anio) {
                if (fecha1.mes > fecha2.mes) {
                    return true;
                } else if (fecha1.mes == fecha2.mes) {
                    return fecha1.dia > fecha2.dia;
                }
            }
            return false;
        }
    
        public void fechaFutura(int i) {
        }
        
       
    
}
