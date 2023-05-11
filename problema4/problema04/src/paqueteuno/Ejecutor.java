/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;
import paquetedos.Banco;
import paquetedos.Cliente;

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
        Cliente cliente = new Cliente("Natalia Erika", "Ruiz Lopez",
                "112323394");
        Banco banco = new Banco("Banco de Guayakil", 24);

        Cheque cheque1 = new Cheque();
        Cheque cheque2 = new Cheque(cliente, banco, 32232.21);

        cheque1.calcularComision();
        cheque2.calcularComision();

        System.out.printf("%s\n%s\n", cheque1, cheque2);
    }

}
