/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genitore;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author russo.salvatore
 */
public class kebabaro implements Runnable{
   public  boolean kebab;
   
   public synchronized boolean sfornakebab(){
       kebab=false;
       prepara();
       return kebab;
       
   }
   public void prepara(){
        try {
           sleep(5000);
           kebab=true;
       } catch (InterruptedException ex) {
          
       }
   }

    @Override
    public void run() {
       sfornakebab();
    }
   
}
