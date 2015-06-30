/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;

/**
 *
 * @author T-107
 */
public class FiinDeCuatri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // Creamos un objeto de tipo examen parcial
        
        ExamenParcial eParcial=new ExamenParcial();
                       eParcial.setCalificacion(10);
                       eParcial.setPorcentaje(0.5f);
                       
       // Creamos un objeto de tipo examen final
                       
                       ExamenFinal eFinal=new ExamenFinal();
                       eFinal.setCalificacion(10);
                       eFinal.setPorcentaje(0.5f);
        //creamos el modelo
                       ModeloEvaluacion modelo=new ModeloEvaluacion();
          System.out.println(modelo.evaluar(eParcial, eFinal));
                       
                       
        
    }
    
}
