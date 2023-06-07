/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

import java.util.*;

/**
 *
 * @author Andre Sebastián
 */
public class Revista extends CLibros {
    
    private String tipo_revista;
    
    public Revista(){
    }

    public Revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }

    public Revista(String tipo_revista, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.tipo_revista = tipo_revista;
    }
    
    

    public void setTipo_revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }
    
    public void AgregarRevista(){
        
        Scanner entrada = new Scanner(System.in);
        CLibros datoslibro = new CLibros();
        
        //ingresar los datos del documento
        datoslibro.aceptarDatos();
        System.out.println("Ingrear tipos de revista: ");
        tipo_revista = entrada.nextLine();
    }
}
