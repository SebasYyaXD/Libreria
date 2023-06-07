/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

import java.io.Serializable;
import java.io.*;
import java.util.*;

import Documentos.CLibros;

/**
 *
 * @author Andre Sebastián
 */
public class ArchivoL implements Serializable {
    //objeto para poder guardar los diferentes libros y revistas
    ArrayList<CLibros> listarecuperar = new ArrayList<CLibros>();
    
    //metodo para la lectura del archivo
    public ArrayList<CLibros> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream ("Libro.txt"));
            listarecuperar = (ArrayList<CLibros>)in.readObject(); //Se hace un casteo para que no lea en binario, si no en bytes
            in.close();
            
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    return listarecuperar;
    }
    
    //metodo para escribir
    void serializar(ArrayList<CLibros> listaserializada){
        try{
            //gerar el archivo de salida
            FileOutputStream salida = new FileOutputStream("Libro.txt");
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);
            
            salidaobjeto.writeObject(listaserializada);
            
        }catch (Exception e){
            
            System.out.println("Error " + e.getMessage());
        }
    }

    void guardar(ArrayList<CLibros> listalibros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

