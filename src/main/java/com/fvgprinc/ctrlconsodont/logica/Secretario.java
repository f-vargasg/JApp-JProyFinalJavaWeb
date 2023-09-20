package com.fvgprinc.ctrlconsodont.logica;

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

    public Secretario() {
    }

    public Secretario(int idSecretario, String sector) {
        this.idSecretario = idSecretario;
        this.sector = sector;
    }

}
