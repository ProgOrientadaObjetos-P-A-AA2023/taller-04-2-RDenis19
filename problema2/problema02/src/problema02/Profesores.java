/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;
import paquetedos.Provincia;
/**
 *
 * @author denis
 */
public class Profesores {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia provincia;

    public Profesores(){   
        nombre = "Denis";
        apellido = "Ruiz";
        sueldoBasico = 600;
        cedula = "1150343497";
        provincia = new Provincia();
    
    }
    
    public Profesores(String nom, String ap, double sueldo, String ced,
            Provincia prov) {
        nombre = nom;
        apellido = ap;
        sueldoBasico = sueldo;
        cedula = ced;
        provincia = prov;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public void establecerSueldoBasico(double n) {
        sueldoBasico = n;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        double valorAdd = (sueldoBasico * 20)/100;
        sueldoTotal = sueldoBasico + valorAdd;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    public void establecerProvincia(Provincia n) {
        provincia = n;
    }
    
    

    @Override
    public String toString() {
        String m = String.format("Maestro: %s %s\n"
                + "Provincia: %s\n"
                + "Con numero de habitantes: %d\n"
                + "Numero. Cedula: %s\n"
                + "Sueldo Basico: $%.2f\n"
                + "Sueldo total: $%.2f\n",
                nombre,
                apellido,
                provincia.obtenerNombre(),
                provincia.obtenerNroHabitantes(),
                cedula,
                sueldoBasico,
                sueldoTotal);
        System.out.println("-----------------------------------------------");
        return m;
    }    
}

