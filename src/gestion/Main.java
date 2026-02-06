package gestion;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ingresos i1 = new Ingresos();   // Este objeto guarda todo

        // Crear usuario introduciendo datos
        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce el email:");
        String email = scanner.nextLine();

        System.out.println("Introduce la nómina bruta:");
        double nominaBruta = scanner.nextDouble();
        scanner.nextLine(); // limpiar buffer

        Usuario usuario = new Usuario(nombre, email, nominaBruta);

        System.out.println("\nDatos del usuario:");
        usuario.mostrarDatos();

        // Editar datos
        System.out.println("\n--- Editar datos del usuario ---");

        System.out.println("Nuevo nombre:");
        usuario.setNombre(scanner.nextLine());

        System.out.println("Nuevo email:");
        usuario.setEmail(scanner.nextLine());

        System.out.println("Nueva nómina bruta:");
        usuario.setNominaBruta(scanner.nextDouble());

        System.out.println("\nDatos actualizados:");
        usuario.mostrarDatos();

        int opcion = -1;
        while (opcion != 0) {
            Menu.menuMostrar();
            System.out.println("Elige una opcion:");
            opcion = leer.nextInt();

            Menu.menuOpciones(opcion, leer, i1);
        }
        System.out.println("Suma total de ingresos: " + i1.sumaTotal());
        scanner.close();

    }
}
