/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author T-107
 */
public class ProbarArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[]={1,45,-12,7,89};
    
    int y[]=new int[3];
    y[0]=34;
    y[1]=12;
    y[2]=45;
    
    int z[]=new int[]{3,-12,9};
    
    String hola="hola";
    for(int i=0;i<x.length;i++){
    
            System.out.println("arrego y este elemento tiene un valor de:"+x[i]);
}
    
    for(int f:x){   //es mas facil
     
            System.out.println("este elemento tiene un valor de:"+f);
}      
    
    
    
        byte []algo=hola.getBytes();
        
        for(byte b:algo){
            System.out.println((char)b);
        }
        
    }
    
  //  byte []algo=hola.getBytes();
    //StringBuilder=new StringBuilder();
    //for(Byte valor:algo){
    //builder.append((char)valor);
    
}
   // etiquetax.setTex(builder.toString());

    

