/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class ProbarThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //paso1 creamos el Thread
        PrimerThread t1=new PrimerThread();
        SegundoThread t2=new SegundoThread();
        TercerThread t3=new TercerThread();
        //paso 2. Lo ponemos en estado de inicializado.
        t1.start();
        t2.start();
        t3.start();
        //Paso 3 y 4. Vienen dados por el metodo run.
        
        
        
    }
    
}
