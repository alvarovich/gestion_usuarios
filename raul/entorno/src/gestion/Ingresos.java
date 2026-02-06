package gestion;
import java.util.*;

public class Ingresos {

    private ArrayList<Integer> herencias = new ArrayList<>();
    private ArrayList<Integer> ventas = new ArrayList<>();

    public void addHerencia(int cantidad, Scanner leer) {

        String texto = String.valueOf(cantidad);

        while (!Depurar.depurarInt2(texto)) {
            System.out.println("La herencia no puede ser negativa. Introducela otra vez:");
            texto = leer.nextLine();
        }

        herencias.add(Integer.parseInt(texto));
    }

    public void addVenta(int cantidad, Scanner leer) {

        String texto = String.valueOf(cantidad);

        while (!Depurar.depurarInt2(texto)) {
            System.out.println("La venta no puede ser negativa. Introducela otra vez:");
            texto = leer.nextLine();
        }

        ventas.add(Integer.parseInt(texto));
    }

    public int sumaHerencias() {
        int suma = 0;
        for (int x : herencias) suma += x;
        return suma;
    }

    public int sumaVentas() {
        int suma = 0;
        for (int x : ventas) suma += x;
        return suma;
    }

    public int sumaTotal() {
        return sumaHerencias() + sumaVentas();
    }
}
