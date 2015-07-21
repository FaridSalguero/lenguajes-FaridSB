/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizacion;

/**
 *
 * @author T-107
 */
public class InterfazCompresora {
    public static void main(String[] args) {
        //primero se crea un animal 
        Animal a=new Animal();
        a.setNombre("leon");
        a.setCarnivoro(true);
        ModeloPersistenciaAnimal modelo=new ModeloPersistenciaAnimal();
        try{
            modelo.guardar(a);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            
        }
    }
    
}
