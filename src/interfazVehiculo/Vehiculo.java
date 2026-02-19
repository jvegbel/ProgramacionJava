package interfazVehiculo;

/**
 *
 * @author jvega
 */
public interface Vehiculo {

    double MAXVELOCIDAD = 100.f; // Realmente es una variable constante FINAL

    public void arrancar();

    public double disminuir(double velocidad);
    public void incrementar(double velocidad);
 
    
    //MÉTODOS IMPLEMENTADOS SE LLAMAN DE EXTENSIÓN
    
    // Metodo por defecto, lo puedo reescribir en Coche o Camion
    default void claxon() {
        System.out.println("Sonando claxon vehiculo");
    }
    
    // Metodo Estático  (admite cuerpo) lo debo llamar con Vehiculo, salvo que lo reescriba en Coche o Camion
    static void acelerar(double velocidad) {
        System.out.println("Acelera en" + velocidad + " km/h");
        
    }
    
    
    // Metodo por defecto (admite cuerpo), lo puedo reescribir en Coche o Camion
    default void frenar(double velocidad) {
        System.out.println("Disminuye velocidad en " + velocidad + "km/h");
    }
    
}
