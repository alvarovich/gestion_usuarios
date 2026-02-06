package rama3;
import java.util.*;
public class principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println(" === CALCULO DE GASTOS ===");

		boolean valido=false;
		while(!valido) {
			try {
				
				System.out.println();
				System.out.println("Introduce el gasto del alquiler: ");
				double alquiler = leer.nextDouble();
				System.out.println();
				System.out.println("Introduce el gasto en viajes: ");
				double viajes = leer.nextDouble();
				System.out.println();
				System.out.println("Introduce lso gastos varios");
				double gastosVarios = leer.nextDouble();
				
				Gastos gastos = new Gastos(alquiler, viajes, gastosVarios);
				
				System.out.println(" === RESUMEN DE GASTOS ===");
				System.out.println("Alquiler: " + alquiler + " € " );
				System.out.println("Viajes: " +viajes+ " € ");
				System.out.println("Gatos Varios: " +gastosVarios+ " € ");
				System.out.println("TOTAL GASTOS: " +gastos.calcularTotal()+ "€ ");
				valido=true;
				leer.close();
				
			}catch(InputMismatchException e) {
				System.out.println("ENTRADA NO VÁLIDA, INTRODUCE OTRA VEZ");
				leer.nextLine();
				valido=false;
			}
		}
		
		
	}

}
