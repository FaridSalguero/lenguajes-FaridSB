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
public class ModeloEvaluacion {
    
    public float evaluar(ExamenParcial cParcial, ExamenFinal cFinal)throws Porcentaje{
        if((cParcial.getPorcentaje()+cFinal.getPorcentaje())!=1)throw new Porcentaje();
        float CalificacionFinal=cParcial.getCalificacion()*cParcial.getPorcentaje()+cFinal.getCalificacion()*cFinal.getPorcentaje();
        
    return CalificacionFinal;
        
    }
    
    
}
