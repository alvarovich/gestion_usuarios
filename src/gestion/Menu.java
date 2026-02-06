package gestion;
import java.util.*;

public class Menu {

    public static void menuMostrar() {
        System.out.println("====ELIGE ACCION====");
        System.out.println("0. Salir del programa");
        System.out.println("1. Anadir herencia");
        System.out.println("2. Anadir venta de Wallapop");
        System.out.println();
    }

    public static void menuOpciones(int opcion, Scanner leer, Ingresos i1) {

        switch (opcion) {

        case 0:
            System.out.println("Saliste del programa");
            break;

        case 1:
            System.out.println("Introduce la cantidad recibida de la herencia:");
            int h = leer.nextInt();
            leer.nextLine(); 
            i1.addHerencia(h, leer);
            break;

        case 2:
            System.out.println("Introduce la cantidad recibida de la venta:");
            int v = leer.nextInt();
            leer.nextLine(); 
            i1.addVenta(v, leer);
            break;

        default:
            System.out.println("Opcion no valida");
        }
    }
}
