/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;
import paquetedos.Banco;
import paquetedos.Cliente;
/**
 *
 * @author denis
 */
public class Cheque {
    private Cliente cliente;
    private Banco banco;
    private double valorCheque;
    private double comision;

    public Cheque() {
        cliente = new Cliente();
        banco = new Banco();
        valorCheque = 607.33;
    }

    public Cheque(Cliente cli, Banco ban, double valC) {
        cliente = cli;
        banco = ban;
        valorCheque = valC;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    public void establecerBanco(Banco n) {
        banco = n;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public void establecerValorCheque(double n) {
        valorCheque = n;
    }

    public double obtenerComision() {
        return comision;
    }

    public void calcularComision() {
        double valorAdd = (valorCheque * 0.003)/100;
        comision = valorCheque * valorAdd;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                 Cheque
                                 Cliente: %s %s
                                 Cedula: %s
                                 Banco: %s
                                 Sucursales: %d
                                 Valor: $%.2f
                                 Comision: $%.2f
                                 """,
                cliente.obtenerNombre(),
                cliente.obtenerApellido(),
                cliente.obtenerCedula(),
                banco.obtenerNombre(),
                banco.obtenerSucursales(),
                valorCheque,
                comision);
        System.out.println("-----------------------------------------------");
        return mensaje;
    } 
}

