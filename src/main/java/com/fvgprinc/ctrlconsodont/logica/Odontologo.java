/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvgprinc.ctrlconsodont.logica;

import java.util.Date;
import java.util.List;

/**
 *
 * @author garfi
 */
public class Odontologo extends Persona {

    private int idOdontologo;

    /**
     * Get the value of idOdontologo
     *
     * @return the value of idOdontologo
     */
    public int getIdOdontologo() {
        return idOdontologo;
    }

    /**
     * Set the value of idOdontologo
     *
     * @param idOdontologo new value of idOdontologo
     */
    public void setIdOdontologo(int idOdontologo) {
        this.idOdontologo = idOdontologo;
    }

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

    private List<Turno> listaTurnos;

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

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

    public Odontologo(int idOdontologo, String especialidad, List<Turno> listaTurnos, Usuario unUsuario, Horario unHorario, String dni, String nombre, String apellido, String telefono, Date fecNacimiento) {
        super(dni, nombre, apellido, telefono, fecNacimiento);
        this.idOdontologo = idOdontologo;
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

    

}
