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
import java.util.ArrayList;
public class ModeloPersistenciaAnimal {
String ruta="D:\\animalitos.xxx";    
ArrayList<Animal>animales;
public ModeloPersistenciaAnimal(){
    animales=new ArrayList<Animal>();
    
}

    public void guardar(Animal animal) throws Exception{
        //paso 1 crear el ARCHIVO donde se guardara el animal
        File file=new File(ruta);
        if(file.exists()){
        animales= BuscarTodos();
        }
            FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oss=new ObjectOutputStream(fos);
        animales.add(animal);
        oss.writeObject(animales);
        System.out.println("Animalito comprimido con exito");
        
        
    }    
    public ArrayList<Animal> BuscarTodos()throws Exception{
        Animal a=new Animal();
        File f=new File(ruta);
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        animales= (ArrayList<Animal>) ois.readObject();
        return animales;
    }
        
    
}
