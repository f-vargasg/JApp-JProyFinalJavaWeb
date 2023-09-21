package com.fvgprinc.ctrlconsodont.logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author garfi
 */
@Entity
public class Secretario extends Persona {

    private String sector;

    /**
     * Get the value of sector
     *
     * @return the value of sector
     */
    public String getSector() {
        return sector;
    }

    /**
     * Set the value of sector
     *
     * @param sector new value of sector
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    @OneToOne
    private Usuario unUsuario;

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Secretario() {
    }

    public Secretario(String sector, Usuario unUsuario, int id, String dni, String nombre, String apellido, String telefono, Date fecNacimiento) {
        super(id, dni, nombre, apellido, telefono, fecNacimiento);
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

}
