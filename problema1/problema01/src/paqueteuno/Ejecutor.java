/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;
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
        Universidad universidad = new Universidad();
        Estudiante estudiante = new Estudiante();
        estudiante.establecerUniversidad(universidad);
        estudiante.calcularPromedio();
        System.out.println("---------------------------------------------");
        System.out.printf("%s\n", estudiante);
        
        System.out.println("---------------------------------------------");
        Universidad universidad2 = new Universidad("PUCE", "Ave Quito 176");
        Estudiante estudiante2 = new Estudiante("Juan", 9, 6, 10, 
                universidad2);
        estudiante2.calcularPromedio();
        System.out.printf("%s", estudiante2);
    }

}
    
