/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamenMedio;

import java.util.Scanner;
/**
 *
 * @author Itzel
 */
public class Usuario {
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Cuenta getMiCuenta() {
        return miCuenta;
    }

    public void setMiCuenta(Cuenta miCuenta) {
        this.miCuenta = miCuenta;
    }
    private String nombre;
    private String apellidoP;
    private String direccion;
    private int telefono;
    private int celular;

    public Usuario(String nombre, String apellidoP, String direccion, int telefono, int celular) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }        
    private Cuenta miCuenta;        
    
    public void crearCuenta()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Monto para abrir la cuenta:");
        double saldoInicial = s.nextDouble();
        System.out.println("Fecha de creación de la cuenta:");
        double fechaCreacion = s.nextDouble();
        System.out.println("Numero de cuenta:");
        int numCuenta = s.nextInt();
        
        miCuenta = new Cuenta(numCuenta, saldoInicial, fechaCreacion);                
    }
    
    public void imprimirSaldo()
    {
        miCuenta.imprimiSaldo();
    }
    
    public void depositar(double cantidad, double fecha)
    {
        miCuenta.depositar(cantidad, fecha);
    }
    
    public void retirar(double cantidad, double fecha)
    {
        miCuenta.retirar(cantidad, fecha);
    }
    
    public static void main(String[] args) {
        Usuario yo = new Usuario
        ("ariel", "pérez", "puebla 22", 555555, 044555);
        yo.crearCuenta();
        yo.imprimirSaldo();
        yo.depositar(250, 14.03);
        yo.depositar(3, 14.03);
        yo.imprimirSaldo();
        yo.retirar(258, 14.03);
        yo.imprimirSaldo();
    }
}
