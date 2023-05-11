/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

/**
 *
 * @author denis
 */
public class Universidad {
    private String nombreUniversidad;
    private String direccion; 

    public Universidad() {
        nombreUniversidad = "UTPL";
        direccion = "San Cayetano Alto, C.Paris, Loja";
    }

    public Universidad(String n, String d) {
        nombreUniversidad = n;
        direccion = d;
    } 

    public void establecerNombre(String n) {
        nombreUniversidad = n;
    } 

    public String obtenerNombre() {
        return nombreUniversidad;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }

    public String obtenerDireccion() {
        return direccion;
    }
    
}


