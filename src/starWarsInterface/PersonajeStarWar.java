
package starWarsInterface;

/**
 *
 * @author jvegbel
 */
public class PersonajeStarWar {
    private String nombre;
    private double fuerza;
    private Estado estado;
    private int midiclorianos;
    
    public PersonajeStarWar(String nombre, int fuerza, Estado estado, int midiclorianos) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.estado = estado;
        this.midiclorianos = midiclorianos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the fuerza
     */
    public double getFuerza() {
        return fuerza;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @return the midiclorianos
     */
    public int getMidiclorianos() {
        return midiclorianos;
    }
    
    @Override
    public String toString() {
        return String.format("%-20s  %-4.1f  %-6s  %-4d ", nombre, fuerza, estado, midiclorianos );
    }
    

}
