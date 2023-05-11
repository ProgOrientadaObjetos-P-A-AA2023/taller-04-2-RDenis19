/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;
import paquetedos.Fabricante;
/**
 *
 * @author denis
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabricante fabricante = new Fabricante("Toyota", "Tokio");
        
        Automotor automotor1 = new Automotor();
        Automotor automotor2 = new Automotor("21312dsw",
                2003, 35000, fabricante);
        
        automotor1.calcularValorMatricula();
        automotor2.calcularValorMatricula();
        
        System.out.printf("%s\n%s\n", automotor1, automotor2);
    }
    
}
    