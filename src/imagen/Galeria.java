/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagen;

import java.io.Serializable;

/**
 *
 * @author T-107
 */
public class Galeria implements Serializable{
    private String titulo;
    private String descripcion;
    private byte[] DatosImagen;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getDatosImagen() {
        return DatosImagen;
    }

    public void setDatosImagen(byte[] DatosImagen) {
        this.DatosImagen = DatosImagen;
    }
    
    
}
