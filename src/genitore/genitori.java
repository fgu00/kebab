/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genitore;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author russo.salvatore
 */
public class genitori implements Runnable{
 private boolean soddisfazione=false;
 private boolean verifica=false; 
kebabaro a;
 private int nome;
public genitori(int b,kebabaro a){
     this.a=new kebabaro();
     nome=b;
}

    
    
    @Override
    public void run() {
        while(!verifica){
           while(!soddisfazione){
               soddisfazione=a.sfornakebab();
               if(soddisfazione==true){
                   System.out.println("THREAD "+nome+" SODDSFATTO");
                   notifyAll();
               }else{
                   try {
                       wait();
                   } catch (InterruptedException ex){}
               }
        }
    }
    }
    public void termina (){
        verifica=true;
    }
    
}
