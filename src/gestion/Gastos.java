package gestion;

public class Gastos {

	private double alquiler;
	private double viajes;
	private double gastosVarios;
	
	public Gastos ( double alquiler, double viajes, double gastosVarios) {
		this.alquiler = alquiler;
		this.viajes = viajes;
		this.gastosVarios = gastosVarios;
	}
	
	public double calcularTotal () {
		return alquiler + viajes + gastosVarios;
	}
	
	public void validar (double valor, String campo ) {
		if ( valor>0 ) {
			System.out.println("El campo ' " + campo + "' no puede ser negativo.");
		}
	}

	@Override
	public String toString() {
		return "Gastos [alquiler=" + alquiler + ", viajes=" + viajes + ", gastosVarios=" + gastosVarios + ", total=" +calcularTotal() + "]";
	}
	
	
}
