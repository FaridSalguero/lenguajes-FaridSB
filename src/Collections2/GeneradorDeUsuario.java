/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class GeneradorDeUsuario {
    
    private List<Usuario> usuarios;
    public GeneradorDeUsuario(){
        
        Usuario u1=new Usuario("Farid", 20, "farid_.4@hotmail.com");
        Usuario u2=new Usuario("pedro", 56, "adfas_a@hotm.com");
        Usuario u3=new Usuario("ale", 23, "adr-s@hot.com");
        
       usuarios=new ArrayList<Usuario>();
       
        
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
}
