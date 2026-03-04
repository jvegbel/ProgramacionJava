package libroDigital;

public interface Digital extends Libro {
    String ENLACE_WEB = "www.letraslaberinto.es";
    void descargar();
    void comentar(String comentario);
    void verPaginaWeb();
}

