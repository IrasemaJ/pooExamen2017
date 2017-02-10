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
public class AlmacenDonas {
    
    private Dona[] almacen;
    private FabricaDonas fabrica;
    private int numDonas;

    public Dona[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Dona[] almacen) {
        this.almacen = almacen;
    }
    
    public void surtir(int n, int precio, String sabor, String cubierta){
        
        for (int i = 0; i < 10; i++) {
            
            almacen[numDonas] = fabrica.crearDona(12, "chocolate", "Fresa");
            numDonas++;
        }
    }
    
    public void inicializaAlmacen(){
        
        almacen = new Dona[5000];
        fabrica = new FabricaDonas();
    }
    
    public void cuantasDonasHay(){
        System.out.println("Hay almacenadas: "+ numDonas);
    }
    
    public static void main(String[] args) {
        AlmacenDonas almacen;
        almacen = new AlmacenDonas();
        
        almacen.inicializaAlmacen();
        almacen.surtir(15, 14, "fresa", "choco");
        almacen.surtir(5, 12, "fresa", "fresa");
        almacen.cuantasDonasHay();
    }
}
