
package com.fvgprinc.ctrlconsodont.logica;

import com.fvgprinc.ctrlconsodont.persistencia.ControladoraPersistencia;

/**
 *
 * @author garfi
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(int id, String nombreUsuario, String constrasenia, String rol) {
        Usuario usu = new Usuario(id, nombreUsuario, constrasenia, rol);
        controlPersis.crearUsuario (usu);
    }
}
