/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author denis
 */
public class Provincia {
    private String nombreProvincia;
    private int numeroHabitantes;

    public Provincia() {
        nombreProvincia = "Loja";
        numeroHabitantes = 214855;
    }

    public Provincia(String nom, int num) {
        nombreProvincia = nom;
        numeroHabitantes = num;
    }

    public String obtenerNombre() {
        return nombreProvincia;
    }

    public void establecerNombre(String n) {
        nombreProvincia = n;
    }

    public int obtenerNroHabitantes() {
        return numeroHabitantes;
    }

    public void establecerNroHabitantes(int n) {
        numeroHabitantes = n;
    }
}