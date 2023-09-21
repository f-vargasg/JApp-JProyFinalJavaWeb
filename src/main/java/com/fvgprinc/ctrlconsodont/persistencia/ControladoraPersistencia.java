
package com.fvgprinc.ctrlconsodont.persistencia;

import com.fvgprinc.ctrlconsodont.logica.Usuario;



/**
 *
 * @author garfi
 */
public class ControladoraPersistencia {
     HorarioJpaController horaJPA = new HorarioJpaController();
     OdontologoJpaController ondontoJPA  =new OdontologoJpaController();
     PacienteJpaController pacJPA = new PacienteJpaController();
     PersonaJpaController persJPA = new PersonaJpaController();
     ResponsableJpaController respJPA= new ResponsableJpaController();
     SecretarioJpaController secreJPA = new SecretarioJpaController();
     TurnoJpaController turnJPA = new TurnoJpaController();
     UsuarioJpaController usuJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }
     
     
}
