import javax.swing.*;
import java.time.LocalDate;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private double precioAlquiler;
    private int numeroPaginas;
    private boolean estadoPrestamo;
    private LocalDate fechaPrestamo;
    private String cliente;
    private int anio;

    //Constructores

    public Libro(String titulo, String autor, double precioAlquiler, int numeroPaginas, boolean estadoPrestamo, LocalDate fechaPrestamo, String cliente,int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precioAlquiler = precioAlquiler;
        this.numeroPaginas = numeroPaginas;
        this.estadoPrestamo = estadoPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.cliente = cliente;
        this.anio=anio;
    }
    //hice un constructor vacio, solo inicie cliente para crearlo y usar el menu / volverme loca

    public Libro(String cliente) {
            this.titulo = "";
            this.autor = "";
            this.precioAlquiler = 0.0;
            this.numeroPaginas = 0;
            this.estadoPrestamo = false;
            this.fechaPrestamo = LocalDate.now();
            this.cliente = cliente;
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
    public int getAnio() {
        return anio;
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

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //metodos

    public void prestarLibro(String cliente) {
        if (this.estadoPrestamo) { // si ya esta prestado
            JOptionPane.showMessageDialog(null, "El libro no esta disponible.");
        } else {
            this.estadoPrestamo = true;
            this.cliente = cliente;
            this.fechaPrestamo = LocalDate.now();
            JOptionPane.showMessageDialog(null, "El libro ha sido prestado a "+ cliente +" en la fecha " + fechaPrestamo);
        }

    }
    public void devolverLibro() {
        if (!this.estadoPrestamo) {
            JOptionPane.showMessageDialog(null, "El libro esta disponible.");
        } else {
            this.estadoPrestamo = false;
            this.fechaPrestamo = LocalDate.now();
            JOptionPane.showMessageDialog(null, "El libro ha sido devuelto por: " +this.cliente);
        }
    }
    public void consultarEstado() {
        if (estadoPrestamo) {
            JOptionPane.showMessageDialog(null, "El libro esta prestado a " + this.cliente + " desde la fecha: " + this.fechaPrestamo);
        } else {
            JOptionPane.showMessageDialog(null, "El libro esta disponible");
        }
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precioAlquiler=" + precioAlquiler +
                ", numeroPaginas=" + numeroPaginas +
                ", estadoPrestamo=" + estadoPrestamo +
                ", fechaPrestamo=" + fechaPrestamo +
                ", cliente='" + cliente + '\'' +
                ", anio=" + anio +
                '}';
    }
}

