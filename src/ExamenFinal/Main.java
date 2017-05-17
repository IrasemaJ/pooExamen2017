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
public class Main {
    
    public static void main(String[] args) {
        Panel a = new Panel();
        TextField text = new TextField();
        text.setLineas("MULTILINEA");
        
        Boton bo = new Boton();
        Action click = new Action() {
            @Override
            public void actionPerformed() {
                
            }
        };
        bo.addAction(click);
        
        Boton b = new Boton();
        Action borrar = new Action() {
            @Override
            public void actionPerformed() {
                
            }
        };
        b.addAction(borrar);
        
        Boton c = new Boton();
        Action agregar = new Action() {
            @Override
            public void actionPerformed() {
                
            }
        };
        c.addAction(agregar);
        
        Boton d = new Boton();
        Action uno = new Action() {
            @Override
            public void actionPerformed() {
                
            }
        };
        d.addAction(uno);
        
        Boton e = new Boton();
        Action hola = new Action() {
            @Override
            public void actionPerformed() {
                
            }
        };
        e.addAction(hola);
        
        Boton h = new Boton();
        Action adios = new Action() {
            @Override
            public void actionPerformed() {
                
            }
        };
        h.addAction(adios);
        
        a.addComponet(text);
        a.addComponet(bo);
        a.addComponet(b);
        a.addComponet(c);
        a.addComponet(d);
        a.addComponet(e);
        a.addComponet(h);
    }
    
}
