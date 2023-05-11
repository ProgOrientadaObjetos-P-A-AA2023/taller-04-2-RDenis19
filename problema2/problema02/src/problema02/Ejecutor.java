/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import paquetedos.Provincia;
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
        Provincia provincia01 = new Provincia("Cariamanga", 12200);
        
        Profesores profesores01 = new Profesores();
        Profesores profesores02 = new Profesores("David", "Velez",
                350, "11764534", provincia01);
        
        profesores01.calcularSueldoTotal();
        profesores02.calcularSueldoTotal();
        
        System.out.printf("%s\n%s\n", profesores01, profesores02);
        System.out.println("-----------------------------------------------");
    }
    
}

