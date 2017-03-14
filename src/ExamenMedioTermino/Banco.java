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
    //private Cuenta [] arrayFecha1;
    //private Cuenta [] arrayFecha2;
    
    private int numSaldo1;
    private int numSaldo2;
    //private int fecha1; //cliente 1
    //private int fecha2; //cliente 2
    private Cuenta numCuenta;
    Cuenta temp1;
    //Cuenta fechaA;
    Cuenta temp2;
    //Cuenta fechaB;
    //private int tempRetiro1;
    //private int tempRetiro2;
    private int cont1;
    private int cont2;

    
    
    public void inciar(int numCuenta, int saldoMax, int fechaInicial){
        
        arrayCliente1 = new Cuenta[saldoMax];
        arrayCliente2 = new Cuenta[saldoMax];
        //arrayFecha1 = new Cuenta[fechaInicial];
        //arrayFecha2 = new Cuenta[fechaInicial];
        
        temp1 = new Cuenta(numCuenta, 0, 0);
        //fechaA = new Cuenta(numCuenta,0,0);
        temp2 = new Cuenta(numCuenta, 0, 0);
        //fechaB = new Cuenta(numCuenta,0,0);
        
        
        numSaldo1 = 0;
        numSaldo2 = 0;
        //tempRetiro1 = numSaldo1;
        //tempRetiro2 = numSaldo2;
        //fecha1 =0;
        //fecha2 =0;
        cont1 = 0;
        cont2 = 0;
        
        //this.numCuenta = numCuenta;
        this.numCuenta = new Cuenta(numCuenta,0,0);
    }
    
    public void deposito(int numCuenta, int deposito, int fecha){
        
        
        if ((cont1 == 0) && (cont2 == 0)) {
            Cuenta temp2 = new Cuenta(numCuenta, 0, 0);
            //Cuenta fechaB = new Cuenta(numCuenta,0,0);
        }
        if (numCuenta == 1) {
            if (deposito < 0) {
                System.out.println("No se puede numeros negativos");
            }
            else{
                
                numSaldo1 = numSaldo1 + deposito;
                temp1.setNumCuenta(numCuenta);
                temp1.setSaldo(deposito);
                temp1.setFechaApertura(fecha);
                arrayCliente1[cont1] = temp1;
                
                //fechaA.setFechaApertura(fecha);
                //arrayFecha1[cont1] = fechaA;
                cont1++;
            }
            
        }
        if (numCuenta == 2) {
            if (deposito < 0) {
                System.out.println("No se puede numeros negativos");
            }
            else{
                //Cuenta temp2 = new Cuenta(numCuenta, 0, 0);
                //Cuenta fechaB = new Cuenta(numCuenta,0,0);
                numSaldo2 = numSaldo2 + deposito;
                temp2.setNumCuenta(numCuenta);
                temp2.setSaldo(deposito);
                temp2.setFechaApertura(fecha);
                arrayCliente2[cont2] = temp2;
                
                //fechaB.setFechaApertura(fecha);
                //arrayFecha2[cont2] = fechaB;
                cont2++;
            }
        }
        
    }
    
    public void imprimirDeposito(int numCuenta){ 
        
        //temp2 = new Cuenta(numCuenta, 0, 0);
        //fechaB = new Cuenta(numCuenta,0,0);
        
        if (numCuenta == 1) {
            for (int i = (cont1-1); i > (cont1 -10); i--) {
                
                //arrayFecha1[i] = fechaA;
                System.out.println("Deposito num: " + i + " de la cuenta " + numCuenta + " es de: " +  arrayCliente1[i].getSaldo() + " en la fecha: " + arrayCliente1[i].getFechaApertura());
            }
        }
        if (numCuenta == 2) {
            for (int i = (cont2-1); i > (cont2 -10); i--) {
                
                //arrayFecha2[i] = fechaB; 
                //arrayCliente2[i].getSaldo()
                //System.out.println(arrayCliente2[i].getSaldo());
                System.out.println("Deposito num: " + i + " de la cuenta " + numCuenta + " es de: " +  arrayCliente2[i].getSaldo() + " en la fecha: " + arrayCliente2[i].getFechaApertura() );
            }
        }
    }
    
    public void retiro(int numCuenta, int retiro, int fecha){
        
        if (numCuenta == 1) {
            if (retiro < 0) {
                System.out.println("No se puede numeros negativos");
            }
            else{
                //temp1 = new Cuenta(numCuenta, 0, 0); //cuenta temp1
                //fechaA = new Cuenta(numCuenta,0,0); // cuenta fechaA
                numSaldo1 = numSaldo1 - retiro;
                temp1.setNumCuenta(numCuenta);
                temp1.setSaldo(retiro);
                temp1.setFechaApertura(fecha);
                arrayCliente1[cont1-1] = temp1;
                cont1++;
            }
            
        }
        if (numCuenta == 2) {
            if (retiro < 0) {
                System.out.println("No se puede numeros negativos");
            }
            else{
                //temp2 = new Cuenta(numCuenta, 0, 0);
                //fechaB = new Cuenta(numCuenta,0,0);
                numSaldo2 = numSaldo2 - retiro;
                temp2.setNumCuenta(numCuenta);
                temp2.setSaldo(retiro);
                temp2.setFechaApertura(fecha);
                arrayCliente2[cont2-1] = temp2;
                cont2++;
            }
        }
    }
    
    public void imprimirRetiro(int numCuenta){
        //temp2 = new Cuenta(numCuenta, 0, 0);
        //fechaB = new Cuenta(numCuenta,0,0);
        
        if (numCuenta == 1) {
            for (int i = cont1; i > (cont1 -10); i--) {
                //arrayCliente1[i] = temp1;
                //arrayFecha1[i] = fechaA;
                System.out.println("Deposito num: " + i + " de la cuenta " + numCuenta + " es de: " +  arrayCliente1[i].getSaldo() + " en la fecha: " + arrayCliente1[i].getFechaApertura());
            }
        }
        if (numCuenta == 2) {
            for (int i = (cont2-1); i > (cont2 -10); i--) {
                //arrayCliente2[i] = temp2;
               //7arrayFecha2[i] = fechaB; 
                System.out.println("Deposito num: " + i + " de la cuenta " + numCuenta + " es de: " +  arrayCliente2[i].getSaldo() + " en la fecha: " + arrayCliente2[i].getFechaApertura() );
            }
        }
    }
    
    public void imprimirSaldo(){
        //temp2 = new Cuenta(0, 0, 0);
        //fechaB = new Cuenta(0,0,0);
        
        System.out.println("El total de la cuenta es: " + this.numSaldo2);
    }
    
    
    public static void main(String[] args) {
         Banco a = new Banco();
         a.inciar(2, 20,12);
         a.deposito(2, 10, 1217);
         a.deposito(2, 10, 1217);
         a.imprimirSaldo();
         a.imprimirDeposito(2);
         
         
    }
    
    
    
    
}
