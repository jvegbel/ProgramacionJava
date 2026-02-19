
package interfacesHerencia;

/**
 *
 * @author jvega
 */

   // Clase hija 2: hereda de Animal que ya tiene implementada la interfaz heredada
class Murcielago extends Animal {
    public Murcielago(String nombre) {
        super(nombre);
    }
    
    @Override
    public void comer() {
        System.out.println(nombre + " come insectos.");
    }
    
    @Override
    public void moverse() {
        System.out.println(nombre + " camina colgando patas arriba.");
    }
    
    @Override
    public void volar() {
        System.out.println(nombre + " vuela de noche con ecolocalización.");
    } 
}
