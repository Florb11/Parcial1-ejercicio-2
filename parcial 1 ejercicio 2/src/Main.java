import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("src/img/biblio.png");
        ImageIcon icon2 = new ImageIcon("src/img/bilbio2.png");

        int opcionesMenuUno;

        Libro libro1 = new Libro("It", "Stephen King", 1500.0, 1138, false, null, "", 19);
        Libro libro2 = new Libro("The Shining", "Stephen King", 12000.0, 447, false, null, "", 1);
        //Libro libro3 = new Libro("librito", "autorsito", 2, 1, false, null, "", 1);


        do {
            Libro libroGenerico = new Libro("");
            String[] opciones = {"It", "The Shining", "Salir"};

            opcionesMenuUno = JOptionPane.showOptionDialog(null,
                    "Seleccione una opcion",
                    "Menu de Libros",
                    0,
                    0,
                    icon,
                    opciones,
                    opciones[0]);
            switch (opcionesMenuUno) {
                case 0:
                    libroGenerico = libro1;
                    break;
                case 1:
                    libroGenerico = libro2;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Final del programa");
                    break;
            }
            if (opcionesMenuUno != 2) {
                int opcionMenuLibro;
                do {
                    String[] opcionesLibro = {"Prestar libro", "Devolver libro", "Consultar estado", "Mostrar detalles", "Volver al menu principal"};
                    opcionMenuLibro = JOptionPane.showOptionDialog(null,
                            "Seleccione una opcion para el libro ",
                            "Menu del Libro2",
                            0,
                            0,
                            icon2,
                            opcionesLibro,
                            opcionesLibro[0]);

                    switch (opcionMenuLibro) {
                        case 0:
                            String cliente = verificarCliente("Ingrese cliente");
                            libroGenerico.prestarLibro(cliente);
                            break;
                        case 1:
                            libroGenerico.devolverLibro();
                            break;
                        case 2:
                            libroGenerico.consultarEstado();
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, libroGenerico);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                            break;
                    }
                } while (opcionMenuLibro != 4);
            }
        } while (opcionesMenuUno != 2);
    }

    public static String verificarCliente(String mensaje) {
        String palabra = "";
        while (palabra.equals("")) {
            palabra = JOptionPane.showInputDialog(mensaje);
        }
        return palabra;
    }
}

