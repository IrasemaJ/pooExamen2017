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
public class Panel extends Dimension implements API {
    
    protected API [] componentes = new API[7];
    int cont = 0;
    
    public void addComponet(API a){
        
        componentes[cont] = a;
        cont++;
    }
    
    public void setSize(Dimension b){
        b.setHeigth(heigth);
        b.setWidth(width);
    }
    
    public void setVisible(Boolean c){
        if (c == true) {
            System.out.println("EsVisible");
        }
        else{
            System.out.println("No es visible");
        }
    }

    @Override
    public String tipo() {
        return "Panel";
    }
}
