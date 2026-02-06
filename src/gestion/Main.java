package gestion;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ingresos i1 = new Ingresos();   // Este objeto guarda todo

        // Crear usuario introduciendo datos
        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce el email:");
        String email = sc.nextLine();

        System.out.println("Introduce la nómina bruta:");
        double nominaBruta = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        Usuario usuario = new Usuario(nombre, email, nominaBruta);

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

        int opcion = -1;
        while (opcion != 0) {
            Menu.menuMostrar();
            System.out.println("Elige una opcion:");
            opcion = sc.nextInt();

            Menu.menuOpciones(opcion, sc, i1);
        }

        System.out.println(" === CALCULO DE GASTOS ===");
        System.out.println("Suma total de ingresos: " + i1.sumaTotal());
		boolean valido=false;
		while(!valido) {
			try {

				System.out.println();
				System.out.println("Introduce el gasto del alquiler: ");
				double alquiler = sc.nextDouble();
				System.out.println();
				System.out.println("Introduce el gasto en viajes: ");
				double viajes = sc.nextDouble();
				System.out.println();
				System.out.println("Introduce lso gastos varios");
				double gastosVarios = sc.nextDouble();

				Gastos gastos = new Gastos(alquiler, viajes, gastosVarios);

				System.out.println(" === RESUMEN DE GASTOS ===");
				System.out.println("Alquiler: " + alquiler + " € " );
				System.out.println("Viajes: " +viajes+ " € ");
				System.out.println("Gatos Varios: " +gastosVarios+ " € ");
				System.out.println("TOTAL GASTOS: " +gastos.calcularTotal()+ "€ ");
				valido=true;

			}catch(InputMismatchException e) {
				System.out.println("ENTRADA NO VÁLIDA, INTRODUCE OTRA VEZ");
				sc.nextLine();
				valido=false;

			}
		}
        sc.close();
	}
