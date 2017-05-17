/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author Itzel
 */
public class Boton implements API  {
    
    protected String etiqueta;

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    public void addAction(Action c){ 
        System.out.println("Agregar Acccion");
    }

    @Override
    public String toString() {
        return "Boton";
    }

    @Override
    public String tipo() {
        return "";
    }
    
}
