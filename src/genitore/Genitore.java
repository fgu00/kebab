/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genitore;

/**
 *
 * @author russo.salvatore
 */
public class Genitore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // si sviluppi un appilcativo dove dichiarato un array di venti istanze di thread che tentino di accedere simultaneamente ha un risorsa kebab condivisa il kebabaro potra soddsfare una sola richiesta per volta. visualizzare a scher,o inche ordine vengoo soddisfatti i venti clienti, il kebabaro consegna un kebab ogni 5 secondi
        Thread[]a=new Thread[20];
        kebabaro m=new kebabaro();
        for(int d=0;d<20;d++){
            genitori g =new genitori(d,m);
            Thread j=new Thread(g);
            a[d]=j;
           
        }
        for(int f=0;f<20;f++){
            a[f].start();
        }
       
        
    }
    
}
