
package interfacesHerencia;

/**
 *
 * @author jvega
 */
// Clase padre abstracta. 
//Al ser Abstracta no necesita implementar los métodos de la interfaces que implementa
abstract class Animal implements Volador {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    // Metodo abstracto de la clase Animal
    public abstract void comer();
}