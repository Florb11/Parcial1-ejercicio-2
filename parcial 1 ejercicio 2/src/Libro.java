import java.time.LocalDate;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean estadoPrestamo;
    private LocalDate fechaPrestamo;
    private String cliente;
    private static int numeroSerie=0;

    //Constructor

    public Libro(String cliente, LocalDate fechaPrestamo,
                 boolean estadoPrestamo, int numeroPaginas, String autor, String titulo) {
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
        this.estadoPrestamo = estadoPrestamo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.titulo = titulo;
    }
 //get y set
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public boolean isEstadoPrestamo() {
        return estadoPrestamo;
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public String getCliente() {
        return cliente;
    }
    public static int getNumeroSerie() {
        return numeroSerie;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setEstadoPrestamo(boolean estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public static void setNumeroSerie(int numeroSerie) {
        Libro.numeroSerie = numeroSerie;
    }

    //metodos

    public String mostrarEstado() {
        if (this.estadoPrestamo) {
            return "El libro esta disponible.";
        } else {
            return "El libro esta prestado a " + this.estadoPrestamo + " desde " + this.fechaPrestamo + ".";
        }
    }
    public void prestarLibros(){

    }

}
