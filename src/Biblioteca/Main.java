package Biblioteca;

import Biblioteca.Libro;

public class Main {
    public static void main(String[] args) {
       Libro libro = new Libro("la mata","Jan",2000);
        Libro.imprimirResumen("Título del libro", "Autor del libro", 300);

       Revista revista = new Revista("times","tu","2004");
        Revista.imprimirResumen("Título de la revista", "Autor de la revista", 20);


        }
    }

