package Controles;

import Documentos.CLibros;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipularLibros implements Serializable {

    private ArrayList<CLibros> listalibros;
    private ArchivoL objetoarchivolibros = new ArchivoL();

    public ManipularLibros() {
        // Cargar instancia de lista de libros
        listalibros = objetoarchivolibros.leer();
    }

    public void agregarLibro() {
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        while (resp == 's') {
            CLibros objlibro = new CLibros();
            objlibro.aceptarDatos();
            listalibros.add(objlibro);
            System.out.println("Desea agregar otro libro? (s/n)");
            resp = entrada.next().charAt(0);
        }
        objetoarchivolibros.guardar(listalibros);
    }

    public void consultarGeneral() {
        if (listalibros.isEmpty()) {
            System.out.println("No hay libros");
        } else {
            System.out.println("Los libros son: ");
            for (int i = 0; i < listalibros.size(); i++) {
                System.out.println("El id del libro es: " + listalibros.get(i).getNombre());
                System.out.println("El autor del libro es: " + listalibros.get(i).getAutor());
                System.out.println("La editorial del libro es: " + listalibros.get(i).getEditorial());
                System.out.println("El precio del libro es: " + listalibros.get(i).getPrecio());
            }
        }
    }

    public void leerLibros() {
        listalibros = objetoarchivolibros.leer();
    }

    public void borrarLibro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro a borrar: ");
        String nombre = entrada.nextLine();
        int posicion = traePosicion(nombre);
        if (posicion != -1) {
            listalibros.remove(posicion);
            objetoarchivolibros.guardar(listalibros);
            System.out.println("El libro ha sido eliminado correctamente.");
        }
    }

    private int traePosicion(String buscarNombre) {
        int pos = -1;
        for (int i = 0; i < listalibros.size(); i++) {
            if (buscarNombre.equalsIgnoreCase(listalibros.get(i).getNombre())) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
