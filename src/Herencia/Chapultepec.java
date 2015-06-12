/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;



public class Chapultepec {

    
    public static void main(String[] args) {
        
        Pollo p1=new Pollo();
        p1.setNombre("pollito pio");
       
        Leon L1=new Leon();
        L1.setNombre("Timba");
        
         Leon L2=new Leon();
        L2.setNombre("Mufasa");
        
        Delfin d1=new Delfin();
        d1.setNombre("flipper");
        
        Pollo p2=new Pollo();
        p2.setNombre("piuu");
        
       ComportamientoRuido animales[]=new ComportamientoRuido[5];
       
       animales[0]=p1;
       animales[1]=L1;
       animales[2]=L2;
       animales[3]=d1;
       animales[4]=p2;
       
         for(ComportamientoRuido hola:animales ){        
        System.out.println(hola.hacerRuido());
      
         }
       
    }
}
    

