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
public class panino {
 private boolean panino;
 public synchronized boolean prendipanino(){
     if(panino){
         panino=false;
     }
 }
}
