
package programabiblioteca;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public void imprimirInformacion() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Año de Publicación: " + anoPublicacion);
    }
}

class LibroFisico extends Libro {
    private int numeroPaginas;

    public LibroFisico(String titulo, String autor, int anoPublicacion, int numeroPaginas) {
        super(titulo, autor, anoPublicacion);
        this.numeroPaginas = numeroPaginas;
    }
    
       @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo: Libro Físico | Número de Páginas: " + numeroPaginas);
    }
}

class LibroElectronico extends Libro {
    private String formato;

    public LibroElectronico(String titulo, String autor, int anoPublicacion, String formato) {
        super(titulo, autor, anoPublicacion);
        this.formato = formato;
    }
    
       @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo: Libro Electrónico | Formato: " + formato);
    }
}

class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void imprimirInformacionLibros() {
        System.out.println("Información de la Biblioteca:");
        for (Libro libro : libros) {
            libro.imprimirInformacion();
        }
    }
}

public class ProgramaBiblioteca {

    
    public static void main(String[] args) {
        LibroFisico libroFisico = new LibroFisico("El Señor de los Anillos", "J.R.R. Tolkien", 1954, 1200);
        LibroElectronico libroElectronico = new LibroElectronico("Inteligencia Artificial", "Stuart Russell", 1995, "PDF");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libroFisico);
        biblioteca.agregarLibro(libroElectronico);

        biblioteca.imprimirInformacionLibros();
    }
    
}
