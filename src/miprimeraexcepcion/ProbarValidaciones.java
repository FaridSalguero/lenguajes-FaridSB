/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarValidaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int edad=20;
        System.out.println("Vamos a validar tu edad");
        try {
            
            ValidarEdad.validar(edad);
            System.out.println("Si tu te vez no se lanzo la excepcion");
            
        } catch (MenorDeEdadException ex) {
            System.out.println(ex.getMessage());
        } catch(NumberFormatException ex){
            System.out.println("metiste letras y no numeros TONTO!!");
            
        }
        
        
    }
    
}
