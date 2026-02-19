
package interfacesHerencia;

/**
 *
 * @author jvega
 */

// Clase hija 1: hereda de Animal que ya tiene implementada la interfaz heredada
public class Aguila extends Animal {

    public Aguila(String nombre) {
        super(nombre);
    }   
    
    @Override
    public void comer() {
        System.out.println(nombre + " come carne fresca.");
    }
    
    @Override
    public void moverse() {
        System.out.println(nombre + " camina con sus garras.");
    }
    
    @Override
    public void volar() {
        System.out.println(nombre + " vuela alto en el cielo.");
    }
    
}
