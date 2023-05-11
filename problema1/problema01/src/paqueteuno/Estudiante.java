/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;


/**
 *
 * @author denis
 */
public class Estudiante {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad; 

    public Estudiante() {
        nombre = "Denis";
        nota1 = 10;
        nota2 = 10;
        nota3 = 7;
    }

    public Estudiante(String n, double n1, double n2, double n3, Universidad u) {
        nombre = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        universidad = u;
    } 

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerN1(double n1) {
        nota1 = n1;
    }

    public void establecerN2(double n2) {
        nota2 = n2;
    }

    public void establecerN3(double n3) {
        nota3 = n3;
    }

    public void establecerUniversidad(Universidad u) {
        universidad = u;
    }

    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerNota1() {
        return nota1;
    }

    public double obtenerNota2() {
        return nota2;
    }

    public double obtenerNota3() {
        return nota3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public Universidad obtenerUniversidad() {
        return universidad;
    }

    @Override
    public String toString() {
        String x = String.format("Informacion del Estudiante\n"
                + "Nombre de la Universidad: %s\n"
                + "Direccion Universidad: %s\n"
                + "Nombre del estudiante: %s\n"
                + "Calificacion Nota 1: %.2f\n"
                + "Calificacion Nota 2: %.2f\n"
                + "Calificacion Nota 3: %.2f\n"
                + "Promedio calificaciones %.2f",
                obtenerUniversidad().obtenerNombre(),
                obtenerUniversidad().obtenerDireccion(),
                obtenerNombre(),
                obtenerNota1(),
                obtenerNota2(),
                obtenerNota3(),
                obtenerPromedio());
        return x;
    }

}

