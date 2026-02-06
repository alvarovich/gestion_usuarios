package gestion;

public class Usuario {

    private String nombre;
    private String email;
    private double nominaBruta;

    // Constructor
    public Usuario(String nombre, String email, double nominaBruta) {
        this.nombre = nombre;
        this.email = email;
        this.nominaBruta = nominaBruta;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNominaBruta() {
        return nominaBruta;
    }

    public void setNominaBruta(double nominaBruta) {
        this.nominaBruta = nominaBruta;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Nómina bruta: " + nominaBruta);
    }
}
