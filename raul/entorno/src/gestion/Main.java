package gestion;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Ingresos i1 = new Ingresos();   // Este objeto guarda todo

        int opcion = -1;

        while (opcion != 0) {

            Menu.menuMostrar();
            System.out.println("Elige una opcion:");
            opcion = leer.nextInt();

            Menu.menuOpciones(opcion, leer, i1);
        }

        System.out.println("Suma total de ingresos: " + i1.sumaTotal());
    }
}

