
package interfacesHerencia;

/**
 *
 * @author jvega
 */
public class MainInterefacesHerencia {
// Clase principal con ejemplo de uso
    public static void main(String[] args) {
        Aguila aguila = new Aguila("Águila Real");
        Murcielago murcielago = new Murcielago("Murciélago común");
        
        System.out.println("=== ÁGUILA ===");
        aguila.comer();
        aguila.moverse();
        aguila.volar();
        
        System.out.println("\n=== MURCIÉLAGO ===");
        murcielago.comer();
        murcielago.moverse();
        murcielago.volar();
    }
}
