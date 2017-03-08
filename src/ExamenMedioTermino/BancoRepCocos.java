/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenMedioTermino;

/**
 *
 * @author Itzel
 */
public class BancoRepCocos {
    
    private Cuenta [] arraysSaldo; 
    private Cuenta [] arraysfecha; //fecha mes y año.
    private Cuenta a;
    
    
    private double numSaldo;
    private int fecha;
    private int cont;
    private double tempRetiro;
    
    BancoRepCocos(int numMaximoSaldo){
        
        arraysSaldo = new Cuenta[numMaximoSaldo];
        arraysfecha = new Cuenta[numMaximoSaldo];
        
        numSaldo = 0;
        fecha = 0;
        tempRetiro = numSaldo;
    }
    
    public void deposito(double saldo, int fecha){
        
        if (saldo < 0) {
            System.out.println("No se puede numeros negativos");
        }
        else{
            
            numSaldo = numSaldo + saldo;
            arraysSaldo[cont].setSaldo(numSaldo); 
            this.fecha = this.fecha + fecha;
            arraysfecha[cont].setSaldo(fecha);
            cont++;
        }
    }
    
    public void imprimirDepositos(){
        
        for (int i = cont; i < (cont -10); i--) {
            System.out.println("Primer deposito: " + arraysSaldo[i].getSaldo() + "En la fecha: " + arraysfecha[i].getSaldo());
        }
    }
    
    public void retiro(double retiro, int fecha){
        
        if (retiro < 0) {
            System.out.println("No se puede numeros negativos");
        }
        else{
            if (retiro < numSaldo) {
            
                tempRetiro = tempRetiro - retiro;
                arraysSaldo[cont].setSaldo(tempRetiro); 
                this.fecha = this.fecha + fecha;
                arraysfecha[cont].setSaldo(fecha);
                cont++;
            }
            else{
                System.out.println("No se permiten retiros mayores al saldo actual");
            }   
        }
    }
    
    public void imprimirRetiro(){
        for (int i = cont; i < (cont -10); i--) {
            System.out.println("Primer deposito: " + arraysSaldo[i].getSaldo() + "En la fecha: " + arraysfecha[i].getSaldo());
        }
    }
    
    public void imprimirSaldo(){
        
        System.out.println("El total de la cuenta es: " + arraysSaldo[cont].getSaldo());
    }
    
    
    
    
    
    
}
