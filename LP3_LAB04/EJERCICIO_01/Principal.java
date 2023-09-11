package LP3_LAB04.EJERCICIO_01;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[]args){
        ArrayList<Contacto> listaContactos = new ArrayList<>();

        //MENÚ:
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("seleccione una opción:");
            System.out.println("1. Añadir contacto ");
            System.out.println("2. Buscar contacto ");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Mostrar contactos");
            System.out.println("7. salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                System.out.println("has seleccionado la opcion 1");
                System.out.println("ingrese un nombre");
                String nombre = scanner.nextLine();

                System.out.print("ingrese el telefono ");
                String telefono = scanner.nextLine();

                System.out.println("ingrese la direccion ");
                String direccion = scanner.nextLine();
                
                Contacto nuevoContacto = new Contacto(nombre, telefono, direccion);
                listaContactos.add(nuevoContacto);
                System.out.println("contacto agregado");
                break;

                case 2:
                System.out.println("has seleccionado la opcion 2");
                System.out.print("que nombre desea buscar?");
                String terminoBusqueda = scanner.nextLine();

                boolean encontrado = false;

                for (Contacto contacto : listaContactos){
                    if (contacto.getNombre().equalsIgnoreCase(terminoBusqueda)){
                        System.out.println("encontrado" + contacto);
                        encontrado = true;

                    }
                }

                if (!encontrado){
                    System.out.println("no se encontro el contacto");
                }
                break;

                case 3:
                System.out.println("has seleccionado la opcion 3");

                if (!listaContactos.isEmpty()){
                    System.out.println("contactos");
                    for (int i=0; i < listaContactos.size(); i++){
                        System.out.println((i + 1)+ " . " + listaContactos.get(i));
                    }
                    System.out.print("ingrese el numero de contacto a modificar");
                    int indiceModificar = scanner.nextInt();
                    scanner.nextLine();

                    if(indiceModificar >= 1 && indiceModificar <= listaContactos.size()){
                        Contacto contactoAModificar = listaContactos.get(indiceModificar -1);

                        System.out.print("ingrese el nuevo nombre ");
                        String nuevoNombre = scanner.nextLine();
                        System.out.print("ingrese el nuevo telefono ");
                        String nuevoTelefono = scanner.nextLine();
                        System.out.print("ingrese la direccion ");
                        String nuevaDireccion = scanner.nextLine();

                        contactoAModificar.setNombre(nuevoNombre);
                        contactoAModificar.setTelefono(nuevoTelefono);
                        contactoAModificar.setDireccion(nuevaDireccion);

                        System.out.println("contacto modificado");

                    } else {
                        System.out.println("no valido");
                    }
                }else{
                    System.out.println("lista vacia ");
                }
                break;

                case 4:
                System.out.println("has seleccionado la opcion 4");
                if (!listaContactos.isEmpty()) {
                    System.out.println("Lista de contactos:");
                    for (int i = 0; i < listaContactos.size(); i++) {
                        System.out.println((i + 1) + ". " + listaContactos.get(i));
                    }
                    System.out.print("Ingrese el número del contacto a borrar: ");
                    int indiceBorrar = scanner.nextInt();
                    scanner.nextLine();
            
                    if (indiceBorrar >= 1 && indiceBorrar <= listaContactos.size()) {
                        Contacto contactoBorrado = listaContactos.remove(indiceBorrar - 1);
                        System.out.println("Contacto eliminado: " + contactoBorrado);
                    } else {
                        System.out.println("no valido.");
                    }
                } else {
                    System.out.println(" lista vacia");
                }
                
                break;

                case 5:
                System.out.println("has seleccionado la opcion 5");
                break;

                case 6:
                System.out.println("has seleccionado la opcion 6");
                if(!listaContactos.isEmpty()){
                 System.out.println("lista de contactos");
                 for( int i=0; i < listaContactos.size(); i++){
                    System.out.println((i+1) + "." + listaContactos.get(i));
                 }   
                } else {
                    System.out.println("vacio");
                }
                break;

                case 7:
                System.out.println("saliendo UwU");
                scanner.close();
                System.exit(0);
                break;

                default:
                System.out.println("opcion no valida");
                
            }


        }
    }
}
