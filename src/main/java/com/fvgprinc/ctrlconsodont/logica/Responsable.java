package com.fvgprinc.ctrlconsodont.logica;

import java.util.Date;

/**
 *
 * @author garfi
 */
public class Responsable extends Persona {

    private int idResponsable;

    /**
     * Get the value of idResponsable
     *
     * @return the value of idResponsable
     */
    public int getIdResponsable() {
        return idResponsable;
    }

    /**
     * Set the value of idResponsable
     *
     * @param idResponsable new value of idResponsable
     */
    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    private String tipoResp;

    /**
     * Get the value of tipoResp
     *
     * @return the value of tipoResp
     */
    public String getTipoResp() {
        return tipoResp;
    }

    /**
     * Set the value of tipoResp
     *
     * @param tipoResp new value of tipoResp
     */
    public void setTipoResp(String tipoResp) {
        this.tipoResp = tipoResp;
    }

    public Responsable() {
    }

    public Responsable(int idResponsable, String tipoResp, String dni, String nombre, String apellido, String telefono, Date fecNacimiento) {
        super(dni, nombre, apellido, telefono, fecNacimiento);
        this.idResponsable = idResponsable;
        this.tipoResp = tipoResp;
    }

}
