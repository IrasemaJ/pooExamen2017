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
public class Usuarios {
    
    
    private String nombre;
    private String direccion;
    private int telefono;
    private int celular;
    private Cuenta a;

    Usuarios(String nombre, String direccion, int telefono, int celular) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCelular() {
        return celular;
    }
    
    public static void main(String[] args) {
        
        Cuenta Cliente1 = new Cuenta(1, 10022017, 10);
        Cuenta Cliente2 = new Cuenta(2, 10032017, 10);
    }
    
    
}
