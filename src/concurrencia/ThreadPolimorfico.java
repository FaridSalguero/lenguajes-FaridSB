/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

import java.util.Calendar;

/**
 *
 * @author T-107
 */
public class ThreadPolimorfico implements Runnable{
    
    public static void main(String[] args) {
        Runnable r=new ThreadPolimorfico();
        Thread t1=new Thread(r);
        t1.start();
        
    }

    @Override
    public void run() {
        while(true){
        try{
            Thread.sleep(1000);
            //Vamos a crear un relojito chafa
            Calendar cal=Calendar.getInstance();
            int hora=cal.get(Calendar.HOUR);
            int minutos=cal.get(Calendar.MINUTE);
            int segundos=cal.get(Calendar.SECOND);
            int dia=cal.get(Calendar.DATE);
            String horaa=(hora+":"+minutos+":"+segundos);
            System.out.println(horaa);
        }catch(Exception e){
        }
        } 
    }
    
   
    
}
