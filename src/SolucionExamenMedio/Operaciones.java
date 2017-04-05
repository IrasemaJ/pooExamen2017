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
public class Operaciones {
    
    private double fecha;
    private double cantidad;
    private String tipoOperacion;
    
    public Operaciones
    (double cantidad, double fecha, String tipoOperacion) {
        this.fecha = fecha;
        this.tipoOperacion = tipoOperacion;
        this.cantidad = cantidad;
    }
}
