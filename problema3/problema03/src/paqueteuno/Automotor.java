/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;
import paquetedos.Fabricante;
/**
 *
 * @author denis
 */
public class Automotor {
    private String propietario;
    private int aFab;
    private double valor;
    private double valorMatricula;
    private Fabricante fabricante;

    public Automotor() {
        propietario = "456ab789";
        aFab = 2022;
        valor = 123000.56;
        fabricante = new Fabricante();
    }

    public Automotor(String cedulaP, int anioF, double val,
            Fabricante fab) {

        propietario = cedulaP;
        aFab = anioF;
        valor = val;
        fabricante = fab;
    }

    public String obtenerCedPropietario() {
        return propietario;
    }

    public void establecerCedPropietario(String a) {
        propietario = a;
    }

    public int obtenerAnioFab() {
        return aFab;
    }

    public void establecerAnioFab(int a) {
        aFab = a;
    }

    public double obtenerValor() {
        return valor;
    }

    public void establecerValor(double a) {
        valor = a;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        double valorAdd = (valor * 0.002) / 100;
        int antiguedad = 2023 - aFab;
        
        valorMatricula = valorAdd * antiguedad;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public void establecerFabricante(Fabricante a) {
        fabricante = a;
    }
    
    

    @Override
    public String toString() {
        String mensaje = String.format("""
                                 Informacion del Vehiculo:
                                 Fabricado: %s
                                 Ciudad de origen: %s
                                 Cedula Propietario: %s
                                 Año Fabricacion: %d
                                 Valor: $%.2f
                                 Valor Matricula: $%.2f
                                 """,
                fabricante.obtenerNombre(),
                fabricante.obtenerCiudad(),
                propietario,
                aFab,
                valor,
                valorMatricula);
        System.out.println("--------------------------------------");
        return mensaje;
    }
    
    

}

