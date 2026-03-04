package libroDigital;

import java.util.Arrays;

public class LibroDigitalizado extends LibroFisico implements Digital {
    private final String CODIGO_QR;
    private final int PAGINAS_DIGITALES;
    private static String[] foro = new String[0];

    public LibroDigitalizado(LibroFisico libro, String CODIGO_QR, int PAGINAS_DIGITALES) {
        super(libro.CODIGO, libro.titulo, libro.AUTOR, libro.PAGINAS, libro.precio, libro.pasillo, libro.estanteria, libro.fila);
        this.CODIGO_QR = CODIGO_QR;
        this.PAGINAS_DIGITALES = PAGINAS_DIGITALES;
    }

    @Override
    public void descargar() {
        System.out.println("El libro " + getTitulo() + " de " + AUTOR + " se ha descargado mediante el código QR " + CODIGO_QR + ".");
    }

    @Override
    public void comentar(String comentario) {
        foro = Arrays.copyOf(foro, foro.length + 1);
        foro[foro.length - 1] = comentario;
    }

    @Override
    public void verPaginaWeb() {
        System.out.println("Este libro digitalizado no tiene página web. Pero puedes descargarlo mediante el código QR " + CODIGO_QR + ".");
    }

    @Override
    public void verPresentacion() {
        System.out.println("El libro " + getTitulo() + " de " + AUTOR + " tiene " + PAGINAS + " páginas y cuesta " + precio + "€. El libro digital tiene " + PAGINAS_DIGITALES + " páginas.");
    }

    public void verForo() {
        System.out.println("Comentarios sobre el libro " + getTitulo() + ".");
        for (int i = 0 ; i < foro.length; i++)
        System.out.println((i+1) + ". " + foro[i]);
    }

    
    
}
