package com.fvgprinc.ctrlconsodont.logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author garfi
 */

@Entity
public class Responsable extends Persona {


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

    public Responsable(String tipoResp, int id, String dni, String nombre, String apellido, String telefono, Date fecNacimiento) {
        super(id, dni, nombre, apellido, telefono, fecNacimiento);
        this.tipoResp = tipoResp;
    }

    

}
