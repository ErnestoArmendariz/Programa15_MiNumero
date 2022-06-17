/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa15_minumero;

/**
 *
 * @author ernes
 */
public class MiNumero {
     private int numero1;
    private int numero2;
    private int num;
    private int fact;

    public MiNumero(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
  
    }


   

    public int getNumero() {
        return numero1;
    }

    public void setNumero(int numero) {
        this.numero1 = numero;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    void cambiarNumero(int num){
        numero1=num;
        
    }
   public int  sumaNumero(){
       int resul=numero1+numero2;
       return resul;
   }
     public int restaNumero(){
        int res=numero1-numero2;
        return res;
        
    }
    public int getDoble(){
        return numero1*2;
    }
    public int getTriple(){
        return numero1*3;
    }
    public int getCuatriple(){
        return numero1*4;
        
    }
    public int getCuadrado(){
        return numero1*numero2;
    }
    public int getCubo(){
        return numero1*numero1*numero1;
    }
    public int getFact(){
        while(numero1>0){
            fact=fact*numero1;
            numero1=numero1-1;
        }
        return fact;
    }

}
