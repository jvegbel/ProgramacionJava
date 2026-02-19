
package interfazVehiculo;

/**
 *
 * @author jvega
 */
public class Main_vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo tesla = new Coche(); // No puedo declarar un objeto tipo Vehiculo, pero si puedo declarar un objeto
                                      // tipo vehículo e instanciarlo como Coche o Camion 
        Vehiculo tata = new Camion("prueba");
        //Vehiculo prueba = new Vehiculo();     // Da error, Vehiculo es abstracta
        Coche fiat = new Coche("fiat");    // Instancia normal de un Objeto tipo Coche
        Camion iveco = new Camion("Iveco");// Instancia normal de un Objeto tipo Camion
        
        
        
        System.out.println(fiat.getMarca()); // Puedo ver la marca de un Coche
        
 
        System.out.println(iveco.getMarca()); // Puedo ver la marca de un Camion
        tata = (Camion) iveco;// Tengo que hacer un cast ya que no se que tipo de objeto puede ser
        //System.out.println(tata.getMarca()); // No puedo ver la marca de un Vehiculo
        tata.arrancar();// Si puedo usar los métodos del Objeto instanciado
       
        tesla = (Coche) tesla;// Tengo que hacer un cast ya que no se que tipo de objeto puede ser
        //System.out.println(tesla.getMarca()); // No puedo ver la marca de un Vehiculo
        tesla.arrancar();// Si puedo usar los métodos del Objeto instanciado
        
        fiat.arrancar();
        System.out.println(Vehiculo.MAXVELOCIDAD);
        //Vehiculo.MAXVELOCIDAD = 50; Error porque sabe que es un FINAL
        
        Vehiculo.acelerar(50);
        fiat.claxon();
         iveco.claxon();
        fiat.acelerar(50);
         Vehiculo.acelerar(30);
         
         fiat.frenar(20);
         
         fiat.incrementar(50);
         System.out.println("Velocidad después de dismiuir: " + fiat.disminuir(20));
         
         
         
        
        
    }
    
}
