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
public class TextField implements API{
    
    @Override
    public String toString() {
        return "Cuadro de Texto";
    }
    
    protected String titulo;
    protected String texto;
    protected String alineacion; //enumerador 
    protected String lineas;
    

    public String getAlineacion() {
        return alineacion;
    }

    public String getLineas() {
        return lineas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setAlineacion(String alineacion) {
        try {
            this.alineacion = alineacion;
            System.out.println("El tipo de alineacion que eligio es: " + 
            Estlio.Alineacion.valueOf(alineacion));
            //System.out.println(TipoDeEstlio.Alineacion.valueOf(alineacion));
        }
        catch(Exception e){            
            TextField cu = new TextField();
            cu.tipo();
            //System.out.println("Intente de nuevo");
        }
        
    }

    public void setLineas(String lineas) {
        try {
            this.lineas = lineas;
            System.out.println("El tipo de tamaño que eligio es: " + 
            Estlio.Tamaño.valueOf(lineas));
            //System.out.println(TipoDeEstlio.Tamaño.valueOf(lineas));
            if ("MULTILINEA".equals(lineas)) {
                API componente = new TextField();
                Scroll s = new Scroll(componente);
                s.addScroll();
            }
        }
        catch(Exception e){            
            TextField cu = new TextField();
            cu.tipo();
            //System.out.println("Intente de nuevo");
        }
    }
    
    public void setfont(Font a, String estilo){

        a.setEstilo(estilo);
    } 
    
    @Override
    public String tipo() {
        System.out.println("////////////////////////////");
        System.out.println("Los valores deben ser introducidos en mayusculas");
        System.out.println("Solo se puede ultizar la alineacion: ");
        System.out.println("LEFT, RIGHT, CENTER");
        System.out.println("El tamaño solo puede ser de UnaLinea o multilineas");
        return "";
    }
    

}
