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
public class FabricaDonas {
    
    Dona d;
    
    public Dona crearDona(int precio, String cubierta, String Sabor) {
    
    d = new Dona();
    d.setCubierta(cubierta);
    d.setPrecio(precio);
    d.setSabor(Sabor);
    
    amasar();
    mezclarIngredientes();
    hornear();
    return d;

    }

    private void amasar() {
        
        System.out.println("Amasando una dona de " + d.getCubierta());
    }

    private void mezclarIngredientes() {
        
        System.out.println("Mezclando ingredientes de sabor " + d.getSabor());
    }

    private void hornear() {
        
        System.out.println("Horneando a 350 ºC");
    }
    
    public Dona[] empaquetar(int n, int precio, String sabor, String cubierta){
        
        Dona[] paquete;
        paquete = new Dona[n];
        
        for (int i = 0; i < n; i++) {
            paquete[i] = crearDona(precio, sabor, cubierta);
        
        }
        System.out.println("Costo total " + (n * precio));
        return paquete;
    }
    
    public static void main(String[] args) {
        FabricaDonas factory;
        factory = new FabricaDonas();
        
        factory.empaquetar(6, 12, "fresa", "Chocolate");
        
    }
}
