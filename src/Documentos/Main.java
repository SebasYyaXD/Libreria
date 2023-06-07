package Documentos;

import Controles.ManipularLibros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ManipularLibros listaLibrosObj = new ManipularLibros();

        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Consultar libros");
            System.out.println("3. Borrar libro");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    listaLibrosObj.agregarLibro();
                    break;
                case 2:
                    listaLibrosObj.consultarGeneral();
                    break;
                case 3:
                    listaLibrosObj.borrarLibro();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }
}
