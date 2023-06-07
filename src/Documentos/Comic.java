/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

import java.util.Scanner;

public class Comic extends CLibros {

    private String marca;
    private String tipoComic;

    public Comic() {
    }

    public Comic(String marca, String tipoComic) {
        this.marca = marca;
        this.tipoComic = tipoComic;
    }

    public Comic(String marca, String tipoComic, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.marca = marca;
        this.tipoComic = tipoComic;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoComic() {
        return tipoComic;
    }

    public void setTipoComic(String tipoComic) {
        this.tipoComic = tipoComic;
    }

    public void agregarComic() {
        Scanner entrada = new Scanner(System.in);
        aceptarDatos();
        System.out.println("Ingresar marca del cómic: ");
        marca = entrada.nextLine();
        System.out.println("Ingresar tipo de cómic: ");
        tipoComic = entrada.nextLine();
    }
}
