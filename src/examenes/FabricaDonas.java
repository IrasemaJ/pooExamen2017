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
public class FabricaDonas {
    
    private Dona ac;
    private String nombreDona;

    public String getNombreDona() {
        return nombreDona;
    }

    public void setNombreDona(String nombreDona) {
        this.nombreDona = nombreDona;
    }
    
    public void obtenerIngredientes(){
        
        System.out.println("Cantidad de Harina:" + ac.getHarina());
        System.out.println("Cantidad de Azucar:" + ac.getAzucar());
        System.out.println("Cantidad de mantequilla:" + ac.getMantequilla() );
        System.out.println("El sabor es:" + ac.getSabor());
        
    }
    
    public void conmbinarIngredientes(){
        
        System.out.println("Combinando ingredientes");
        
    }
    
    public void amasar(){
        
        System.out.println("Creando mezcla y dando forma");
        
    }
    
    public void hornear(){
        
        System.out.println("Horneando a 315 ºC");
    }
    
    public void precio(){
        
        System.out.println("El precio es de:" + ac.getPrecio());
    }
    
    public Dona crearDona(int azucar, int harina, int mantequilla, float precio, String sabor){
        
        ac = new Dona();
        ac.setAzucar(azucar);
        ac.setHarina(harina);
        ac.setMantequilla(mantequilla);
        ac.setPrecio(precio);
        ac.setSabor(sabor);
        obtenerIngredientes();
        conmbinarIngredientes();
        amasar();
        hornear();
        precio();
        return ac;
    }
    
    public void nombre(String nombre){
        
        FabricaDonas nom = new FabricaDonas();
        nom.setNombreDona(nombre);
        System.out.println("El nombre de la dona es: " + nom.getNombreDona());

    }
    
    public void empaquetar(int size){
        
        for (int i = 1; i < size; i++) {
            
            System.out.println("Empaqutando " + i + " docena");
            
        }
    }
    
    
    public static void main(String[] args) {
        
        FabricaDonas crear = new FabricaDonas();
        crear.nombre("deli");
        Dona c;
        c = crear.crearDona(23, 45, 15, 200, "chocolate");      
    }
    
    
}
