package libroDigital;

import java.util.Comparator;
/**
 *
 * @author jvega
 */
public class ComparaAutor implements Comparator {
    
    @Override
    public int compare(Object ob1, Object ob2) {
        return ((LibroFisico) ob1).AUTOR.compareTo( ((LibroFisico) ob2).AUTOR);
    }
}
