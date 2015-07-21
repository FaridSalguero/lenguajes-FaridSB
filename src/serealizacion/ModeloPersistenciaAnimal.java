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
import java.io.*;
public class ModeloPersistenciaAnimal {
    
    public void guardar(Animal animal) throws Exception{
        //paso 1 crear el ARCHIVO donde se guardara el animal
        File file=new File("D:\\animalitos.xxx");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oss=new ObjectOutputStream(fos);
        oss.writeObject(animal);
        System.out.println("Animalito comprimido con exito");
        
        
    }    
    
}
