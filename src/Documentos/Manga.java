/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

import java.util.Scanner;

public class Manga extends CLibros {

    private String tipoManga;

    public Manga() {
    }

    public Manga(String tipoManga) {
        this.tipoManga = tipoManga;
    }

    public Manga(String tipoManga, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.tipoManga = tipoManga;
    }

    public String getTipoManga() {
        return tipoManga;
    }

    public void setTipoManga(String tipoManga) {
        this.tipoManga = tipoManga;
    }

    public void agregarManga() {
        Scanner entrada = new Scanner(System.in);
        aceptarDatos();
        System.out.println("Ingresar tipo de manga: ");
        tipoManga = entrada.nextLine();
    }
}
