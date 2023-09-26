
package com.fvgprinc.ctrlconsodont.logica;

import com.fvgprinc.ctrlconsodont.persistencia.ControladoraPersistencia;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garfi
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(String nombreUsuario, String constrasenia, String rol) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(constrasenia);
        usu.setRol(rol);
        controlPersis.crearUsuario (usu);
    }

    public List<Usuario> getUsuarios() {
        return controlPersis.getUsuarios(); 
    }

    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

    public boolean comprobarIngreso(String usuario, String contrasenia) {
       List<Usuario> listaUsuarios = new ArrayList<>();
       boolean ingresoValido = false;
       
       listaUsuarios = controlPersis.getUsuarios();
       
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContrasenia().equals(contrasenia)) {
                    ingresoValido = true;
                }
            }
            
        }
              return ingresoValido;
    }
}
