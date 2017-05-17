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
public class Font implements API{
    
    protected int puntos;
    protected String estilo;
    protected String fuente;

    public void setSize(int puntos) {
        this.puntos = puntos;
    }

    public void setEstilo(String estilo) {
        try {
            this.estilo = estilo;
            System.out.println("El tipo de fuente que eligio es: " + 
            Estlio.Estilo.valueOf(estilo));
        }
        catch(Exception e){            
            Font f = new Font();
            f.tipo();
            System.out.println("Intente de nuevo");
        }
    }
    
    public void setFuente(String fuente) {
        try {
            this.fuente = fuente;
            System.out.println("El tipo de fuente que eligio es: " + 
            Estlio.Estilo.valueOf(fuente));
        }
        catch(Exception e){            
            Font f = new Font();
            f.tipo();
            System.out.println("Intente de nuevo");
        }
    }

    public String getFuente() {
        return fuente;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public String getEstilo() {
        return estilo;
    }

    public Font() {
    }

    public Font(String fuente, String estilo, int puntos) {
        this.puntos = puntos;
        this.estilo = estilo;
        this.fuente = fuente;
    }

    

    @Override
    public String tipo() {
        System.out.println("////////////////////////////");
        System.out.println("Los valores deben ser introducidos en mayusculas");
        System.out.println("Solo se puede seleccionar BOLD, ITALIC, NONSTYLE");
        System.out.println("Solo se puede seleccionar COURIER, ARIAL, TIMES");
        return "";
    }
}
