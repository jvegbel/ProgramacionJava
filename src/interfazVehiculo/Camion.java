
package interfazVehiculo;

/**
 *
 * @author jvega
 */



class Camion implements Vehiculo {
    
    private String marca;
    private double velocidad;
    
    public Camion (String marca) {
        this.marca = marca;
    }
    
    public Camion() {
        marca = null;
    }
    public void arrancar() {
        System.out.println("arrancando el motor del camión...");
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
    
     public void incrementar(double velocidad) {
       this.velocidad += velocidad;
     }
    
}
