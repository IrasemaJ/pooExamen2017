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
public class Banco {
    
    private Cuenta [] arrayCliente1;
    private Cuenta [] arrayCliente2;
    
    private int numSaldo1;
    private int numSaldo2;
    private int fecha1; //cliente 1
    private int fecha2; //cliente 2
    private Cuenta numCuenta;
    private int tempRetiro1;
    private int tempRetiro2;
    private int cont1;
    private int cont2;
    private int dia;

    
    
    public void inciar(int numCuenta, int saldoMax){
        
        arrayCliente1 = new Cuenta[saldoMax];
        arrayCliente2 = new Cuenta[saldoMax];
        
        numSaldo1 = 0;
        numSaldo2 = 0;
        tempRetiro1 = numSaldo1;
        tempRetiro2 = numSaldo2;
        cont1 = 0;
        cont2 = 0;
        
        //this.numCuenta = numCuenta;
        this.numCuenta = new Cuenta(numCuenta,0,0);
    }
    
    public void deposito(int numCuenta, int deposito, int fecha){
        
        
        if (numCuenta == 1) {
            if (deposito < 0) {
                System.out.println("No se puede numeros negativos");
            }
            else{
                Cuenta temp1 = new Cuenta(numCuenta, 0, 0);
                numSaldo1 = numSaldo1 + deposito;
                fecha1 = fecha1 + fecha;
                temp1.setSaldo(numSaldo1);
                arrayCliente1[cont1] = temp1;
                cont1++;
            }
            
        }
        if (numCuenta == 2) {
            if (deposito < 0) {
                System.out.println("No se puede numeros negativos");
            }
            else{
                Cuenta temp2 = new Cuenta(numCuenta, 0, 0);
                numSaldo2 = numSaldo2 + deposito;
                fecha2 = fecha2 + fecha;
                temp2.setSaldo(numSaldo2);
                arrayCliente2[cont2] = temp2;
                cont2++;
            }
        }
        
    }
    
    public void imprimirDeposito(int numCuenta){
        
        if (numCuenta == 1) {
            for (int i = cont1; i < (cont1 -10); i--) {
                dia = fecha1;
                System.out.println("Primer deposito: " + arrayCliente1[i].getSaldo() + "En la fecha: " + dia);
                
        }
        }
    }
    
    
    public static void main(String[] args) {
         Banco a = new Banco();
         a.inciar(1, 10000);
         a.deposito(1, 100, 12012017);
         
         
    }
    
    
    
    
}
