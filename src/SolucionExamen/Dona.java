/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author Itzel
 */
public class Dona {
    private int precio;
    private String sabor;
    private String cubierta;

    public int getPrecio() {
        return precio;
    }

    public String getSabor() {
        return sabor;
    }

    public String getCubierta() {
        return cubierta;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setCubierta(String cubierta) {
        this.cubierta = cubierta;
    }
    
    public void printDona(){
        
        System.out.println("Cubierta:" + cubierta);
        System.out.println("Sabor:" + sabor);
        System.out.println("Precio:" + precio);
    }
}
