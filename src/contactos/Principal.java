package contactos;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        //Array de 50 contactos.
        Contacto [] listadoContactos =  new Contacto [50];
        Scanner leer = new Scanner(System.in);
        Contacto contacto;
        int opcion = 0;
        int posicion = 0;
        String nombre, telefono, email;
        
        System.out.println("¡Hola!");
        System.out.println("--El listado tiene un maximo de 50 contactos.--");
        System.out.println("-------------------------------------------------");
        
        do{
            do{
                opcion = menu(leer, opcion);
            } while (opcion<1 || opcion>3);

            switch(opcion){
                case 1:
                    if (posicion < 50){
                        System.out.println("\nIndique el nombre: ");
                        nombre = leer.nextLine();
                        System.out.println("\nIndique el teléfono: ");
                        telefono = leer.nextLine();
                        System.out.println("\nIndique el E-mail: ");
                        email = leer.nextLine();
                        contacto = new Contacto (nombre, telefono, email, posicion);
                        listadoContactos [posicion] = contacto;
                        posicion++;
                    } else {
                        System.out.println("\n---ERROR---");
                        System.out.println("La lista está llena.");
                    }
                    break;
                case 2:
                    if (posicion!=0) {
                        for (int i = 0; i<posicion; i++) {
                            System.out.println(listadoContactos[i].toString());
                        }
                    } else {
                        System.out.println("\n---ERROR---");
                        System.out.println("No hay usuarios registrados.");
                        System.out.println("La lista esta vacia.");
                    }
                    break;
                case 3:
                    System.out.println("\n¡Gracias por preferirnos!");
                    System.out.println("¡Hasta Luego! :D ");
                    System.out.println("-----------------------------\n");
                    break;
            }
        } while (opcion == 1 || opcion == 2);
    }
    
    static int menu (Scanner leer, int opcion){
        System.out.println("\n¿Qué desea hacer:");
        System.out.println("1) Registrar Usario.");
        System.out.println("2) Imprimir lista de usuarios.");
        System.out.println("3) SALIR.");
        System.out.println("--Indique la opción que desea realizar.--");
        opcion = leer.nextInt();
        leer.nextLine();
        return opcion;
    }
}
