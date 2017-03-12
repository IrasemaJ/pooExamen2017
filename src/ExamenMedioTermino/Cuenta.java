/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenMedioTermino;

/**
 *
 * @author Itzel
 */
public class Cuenta {
    
    private int numCuenta;
    private int fechaApertura;
    private int saldo;
    private Usuarios b;

    Cuenta(int numCuenta, int fechaApertura, int saldo) {
        //this.numCuenta = numCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setFechaApertura(int fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getFechaApertura() {
        return fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public static void main(String[] args) {
        
        Usuarios cliente1 = new Usuarios("Alan", "Naucalpan", 55123426, 51111111);
        Usuarios cliente2 = new Usuarios("Lilian", "Naucalpan", 55555555, 12222222);
        
        
        
        BancoRepCocos banco = new BancoRepCocos(1000000);
        //Banco saldo = new Banco(1000000);
    }
    
    
}
