
package interfazVehiculo;

/**
 *
 * @author jvega
 */
public class Coche implements Vehiculo {
    
    private String marca;
     private double velocidad;
    public Coche(String marca) {
        this.marca = marca;
    }
    
    public Coche() {
        marca = null;
    }
    
    @Override
    public void claxon() {
        System.out.println("Sonando claxon coche");
    }
    
    @Override
    public void arrancar() {
        System.out.println("arrancando motor... coche");
    }
    
    @Override
    public double disminuir(double velocidad) {
        System.out.println("deteniendo motor...");
        this.velocidad -= velocidad;
        return this.velocidad;
    }

    /**
     * @return the marca
     */
    
    public String getMarca() {
        return marca;
    }
    
    public void acelerar(double velocidad) {
        
        System.out.println("Coche acelera a " + velocidad + " km/h");
    }
    
     public void incrementar(double velocidad) {
       this.velocidad += velocidad;
     }
    
}
