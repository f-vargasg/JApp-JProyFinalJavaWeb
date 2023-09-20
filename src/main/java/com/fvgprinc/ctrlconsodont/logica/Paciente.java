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
public class Paciente extends Persona {
    
    private int idPaciente;

    /**
     * Get the value of idPaciente
     *
     * @return the value of idPaciente
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * Set the value of idPaciente
     *
     * @param idPaciente new value of idPaciente
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
        private boolean tieneOs;

    /**
     * Get the value of tieneOs
     *
     * @return the value of tieneOs
     */
    public boolean isTieneOs() {
        return tieneOs;
    }

    /**
     * Set the value of tieneOs
     *
     * @param tieneOs new value of tieneOs
     */
    public void setTieneOs(boolean tieneOs) {
        this.tieneOs = tieneOs;
    }

        private String tipoSangre;

    /**
     * Get the value of tipoSangre
     *
     * @return the value of tipoSangre
     */
    public String getTipoSangre() {
        return tipoSangre;
    }

    /**
     * Set the value of tipoSangre
     *
     * @param tipoSangre new value of tipoSangre
     */
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    private Responsable unResponsable;

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }
   
    
    private List<Turno> listaTurnos;

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    
    
    
    public Paciente() {
    }

    public Paciente(int idPaciente, boolean tieneOs, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos, String dni, String nombre, String apellido, String telefono, Date fecNacimiento) {
        super(dni, nombre, apellido, telefono, fecNacimiento);
        this.idPaciente = idPaciente;
        this.tieneOs = tieneOs;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }
    
    
    

    



    

}
