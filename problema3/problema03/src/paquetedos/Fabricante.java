/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author denis
 */
public class Fabricante {
    private String nombreVehiculo;
    private String ciudad;

    public Fabricante() {
        nombreVehiculo = "Chebrolet";
        ciudad = "Japon";
    }

    
    public Fabricante(String nom, String ciu) {
        nombreVehiculo = nom;
        ciudad = ciu;
    }

    public String obtenerNombre() {
        return nombreVehiculo;
    }

    public void establecerNombre(String n) {
        nombreVehiculo = n;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void setCiudad(String n) {
        ciudad = n;
    }    
}
    

