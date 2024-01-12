package Biblioteca;

public class Libro extends Recurso {
    private int numeroPaginas;
    private int generoLiterario;

    public Libro(String titulo, String autor, int anoPublicacion) {
        super(titulo, autor, anoPublicacion);
        this.generoLiterario = generoLiterario;
    }

    public static void imprimirResumen(String titulo, String autor, int numeroPaginas) {
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas );
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(int generoLiterario) {
        this.generoLiterario = generoLiterario;
    }
}