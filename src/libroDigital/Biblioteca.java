package libroDigital;

import java.util.Arrays;

/**
 *
 * @author jvega
 */
public class Biblioteca {
    public LibroFisico[] libros;
    
    public Biblioteca () {
        libros = new LibroFisico[0];
    }
    
    public void add(LibroFisico libro) {
        libros = Arrays.copyOf(libros, libros.length + 1);
        libros[libros.length - 1] = libro;
    }
    
    public void listado() {
        System.out.println(Arrays.deepToString(libros));
    }
    

    
}
