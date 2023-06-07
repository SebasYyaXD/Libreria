/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;
import java.util.Scanner;

public class LibroDeCuentos extends CLibros {

    private String marca;
    private String tipoLibro;

    public LibroDeCuentos() {
    }

    public LibroDeCuentos(String marca, String tipoLibro) {
        this.marca = marca;
        this.tipoLibro = tipoLibro;
    }

    public LibroDeCuentos(String marca, String tipoLibro, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.marca = marca;
        this.tipoLibro = tipoLibro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(String tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    public void agregarLibroDeCuentos() {
        Scanner entrada = new Scanner(System.in);
        aceptarDatos();
        System.out.println("Ingresar marca del libro de cuentos: ");
        marca = entrada.nextLine();
        System.out.println("Ingresar tipo de libro (edad recomendada): ");
        tipoLibro = entrada.nextLine();
    }
}