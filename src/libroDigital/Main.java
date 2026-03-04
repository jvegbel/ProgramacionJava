package libroDigital;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        LibroFisico libro1 = new LibroFisico("001", "El Quijote", "Miguel de Cervantes", 200, 20, 1, 2, 3);
        LibroFisico libro2 = new LibroFisico("002", "La Celestina", "Fernando de Rojas", 150, 15, 1, 2, 4);
        LibroFisico libro3 = new LibroFisico("003", "El laberinto de las aceitunas", "Eduardo Mendoza", 304, 17, 2, 3, 4);
        LibroFisico libro4 = new LibroFisico("004", "El perfume", "Patrick Suskind", 320, 8, 2, 3, 5);
        
        LibroDigitalizado libro10 = new LibroDigitalizado(libro1, "QR001", 100);
        libro10.verPresentacion();
        libro10.comprar();
        libro10.descargar();
        libro10.comentar("Me ha encantado el libro.");
        libro10.comentar("Me lo esperaba mejor.");
        libro10.comentar("No lo he acabado.");
        
        libro10.verForo();
        
        libro2.localizar();
        
        biblioteca.add(libro1);
        biblioteca.add(libro2);
        biblioteca.add(libro3);
        biblioteca.add(libro4);
        biblioteca.listado();
        
        Arrays.sort(biblioteca.libros);
        biblioteca.listado();
        
        Comparator a = new ComparaAutor();
        
                
        Arrays.sort(biblioteca.libros, a);
        biblioteca.listado();
        
          Arrays.sort(biblioteca.libros, a.reversed());
        biblioteca.listado();
        
        Comparator<LibroFisico> porAutor = Comparator.comparing(LibroFisico::getTitulo);
        Arrays.sort(biblioteca.libros, porAutor.reversed());
        biblioteca.listado();
        
        
    }
}