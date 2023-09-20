package com.fvgprinc.ctrlconsodont.logica;

import java.util.Date;

/**
 *
 * @author garfi
 */
public class Secretario extends Persona {

    private int idSecretario;

    /**
     * Get the value of idSecretario
     *
     * @return the value of idSecretario
     */
    public int getIdSecretario() {
        return idSecretario;
    }

    /**
     * Set the value of idSecretario
     *
     * @param idSecretario new value of idSecretario
     */
    public void setIdSecretario(int idSecretario) {
        this.idSecretario = idSecretario;
    }

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

    private Usuario unUsuario;

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Secretario() {
    }

    public Secretario(int idSecretario, String sector, Usuario unUsuario, String dni, String nombre, String apellido, String telefono, Date fecNacimiento) {
        super(dni, nombre, apellido, telefono, fecNacimiento);
        this.idSecretario = idSecretario;
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

}
