public class Diagnostico {
        public void aptoVacunaA(Perro perro){
            if(perro.getTemp() >= 37 && perro.getTemp() <= 40 && perro.peso >5 && perro.getEdad() >1 ){
                System.out.println("el perro esta sano");
            }
            else{
                System.out.println("el perro esta enfermo");
            }
        }
    
        public void aptoVacunaB(int edad, double peso, double temp){
            if(temp >= 37 && temp <= 40 && peso >5 && edad >1 ){
                System.out.println("el perro esta sano");
            }
            else{
                System.out.println("el perro esta enfermo");
            }
        }
    
}
