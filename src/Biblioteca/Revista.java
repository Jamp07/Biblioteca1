package Biblioteca;

public class Revista extends Recurso {

    private String edicion;

    private int numeroPaginas;
    private String genero;



    public Revista(String titulo, String autor, String anoPublicacion) {
        super(titulo, autor, anoPublicacion);
        this.edicion= edicion;
    }
    public static void imprimirResumen(String titulo, String autor, int numeroPaginas) {
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas );
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
