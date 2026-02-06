package gestion;

import java.util.Scanner;

public class Main {

	public static double pedirDouble(Scanner sc) {
        while (true) {
            if (sc.hasNextDouble()) {
                return sc.nextDouble(); // dato válido
            } else {
                System.out.print("Entrada no válida. Introduce un número décimal: ");
                sc.next(); // limpiar la entrada incorrecta
            }
        }
    }
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear usuario introduciendo datos
        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce el email:");
        String email = sc.nextLine();

        System.out.println("Introduce la nómina bruta:");
        double nominaBruta = pedirDouble(sc);
        sc.nextLine(); // limpiar buffer

        usuario usuario = new usuario(nombre, email, nominaBruta);

        System.out.println("\nDatos del usuario:");
        usuario.mostrarDatos();

        // Editar datos
        System.out.println("\n--- Editar datos del usuario ---");

        System.out.println("Nuevo nombre:");
        usuario.setNombre(sc.nextLine());

        System.out.println("Nuevo email:");
        usuario.setEmail(sc.nextLine());

        System.out.println("Nueva nómina bruta:");
        usuario.setNominaBruta(sc.nextDouble());

        System.out.println("\nDatos actualizados:");
        usuario.mostrarDatos();

        sc.close();
    }
}
