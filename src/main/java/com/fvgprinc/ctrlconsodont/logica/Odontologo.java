
package com.fvgprinc.ctrlconsodont.logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author garfi
 */

@Entity
public class Odontologo extends Persona implements Serializable {

    private String especialidad;

    /**
     * Get the value of especialidad
     *
     * @return the value of especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Set the value of especialidad
     *
     * @param especialidad new value of especialidad
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    @OneToMany(mappedBy = "odonto")
    private List<Turno> listaTurnos;

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    @OneToOne
    private Usuario unUsuario;

    /**
     * Get the value of unUsuario
     *
     * @return the value of unUsuario
     */
    public Usuario getUnUsuario() {
        return unUsuario;
    }

    /**
     * Set the value of unUsuario
     *
     * @param unUsuario new value of unUsuario
     */
    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    @OneToOne
    private Horario unHorario;

    /**
     * Get the value of unHorario
     *
     * @return the value of unHorario
     */
    public Horario getUnHorario() {
        return unHorario;
    }

    /**
     * Set the value of unHorario
     *
     * @param unHorario new value of unHorario
     */
    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario unUsuario, Horario unHorario, int id, String dni, String nombre, String apellido, String telefono, Date fecNacimiento) {
        super(id, dni, nombre, apellido, telefono, fecNacimiento);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

    

    

}
