/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author denis
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    
    public Cliente(){
        nombre = "Denis Leandro";
        apellido = "Ruiz Lopez";
        cedula = "1150343497";
    }
    
    public Cliente(String n, String ap, String ced){
        nombre = n;
        apellido = ap;
        cedula = ced;
    }
    
    
    public void establecerNombre(String d){
        nombre = d;
    }
    
    public void establecerApellido(String d){
        apellido = d;
    }
    
    public void establecerCedula(String d){
        cedula = d;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerCedula(){
        return cedula;
    }    
}
