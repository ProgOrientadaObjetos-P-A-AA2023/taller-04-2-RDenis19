/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author denis
 */
public class Banco {
    private String nombre;
    private int sucursales;

    public Banco() {
        nombre = "Banco de Loja";
        sucursales = 10;
    }
    
    public Banco(String nom, int suc) {
        nombre = nom;
        sucursales = suc;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String d) {
        nombre = d;
    }

    public int obtenerSucursales() {
        return sucursales;
    }

    public void establecerSucursales(int d) {
        sucursales = d;
    }
}

