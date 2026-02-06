package gestion;

public class Depurar {
	
	public static boolean depurarInt2 (String x) {
		boolean valido = false;
		try {
			if (Integer.parseInt(x) < 0) {
				valido = false;
			} else {
				valido = true;
			}
		}catch (NumberFormatException e) {
			valido = false;
		}
		return valido;
	}
}
