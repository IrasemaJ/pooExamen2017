/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes;

/**
 *
 * @author Itzel
 */
public class AlmacenDona {
    
    FabricaDonas ac;
    private int[] almacenDocena;
    
    public FabricaDonas agregar(int size){
        
        AlmacenDona almacenDocena = new AlmacenDona();
        ac.empaquetar(size);
        return ac;
        
    }
    
}
