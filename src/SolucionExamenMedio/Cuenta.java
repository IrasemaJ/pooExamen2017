/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamenMedio;

/**
 *
 * @author Itzel
 */
public class Cuenta {
    
    private int numCuenta;
    private double fechaCreacion;
    private double saldo;
    private int contador;
    
    private Operaciones [] misOperaciones;

    public Cuenta(int numCuenta, double saldoInicial, double fechaCreacion) {
        this.numCuenta = numCuenta;
        this.saldo = saldoInicial;
        this.fechaCreacion = fechaCreacion;
        
        misOperaciones = new Operaciones[100];
        contador = 0;
    }        

    void imprimiSaldo()
    {
        System.out.println("El saldo de la cuenta es de:");
        System.out.println(saldo + " pesos");
    }

    void depositar(double cantidad, double fecha)
    {        
        Operaciones o = new Operaciones(cantidad, fecha, "Deposito");        
        misOperaciones[contador] = o;
        contador++;        
        saldo = saldo + cantidad;
    }

    void retirar(double cantidad, double fecha)
    {
        if(cantidad > saldo)
            System.out.println("saldo insuficiente");
        else
        {
            Operaciones o = new Operaciones(cantidad, fecha, "Retiro");        
            misOperaciones[contador] = o;
            contador++;        
            saldo = saldo - cantidad;
        }
    }
    
}
