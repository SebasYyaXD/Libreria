/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

import java.io.*;
import java.util.*;
/**
 *
 * @author Andre Sebastián
 */
public class CLibros {
    
    private String nombre;
    private String autor;
    private String editorial;
    private float precio;
    
    public CLibros(){
    }
    
    public CLibros(String nombre, String autor, String editorial, float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void aceptarDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el nombre del documento: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el autor del documento: ");
        autor = entrada.nextLine();
        System.out.println("Ingresar la editorial del documento: ");
        editorial = entrada.nextLine();
        System.out.println("Ingresar el precio del documento: ");
        precio = entrada.nextFloat();
    }
}
