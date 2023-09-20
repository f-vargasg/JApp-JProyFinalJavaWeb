package com.fvgprinc.ctrlconsodont.logica;

/**
 *
 * @author garfi
 */
public class Usuario {

    private int idUsuario;

    /**
     * Get the value of idUsuario
     *
     * @return the value of idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Set the value of idUsuario
     *
     * @param idUsuario new value of idUsuario
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    private String nombreUsuario;

    /**
     * Get the value of nombreUsuario
     *
     * @return the value of nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Set the value of nombreUsuario
     *
     * @param nombreUsuario new value of nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    private String contrasenia;

    /**
     * Get the value of contrasenia
     *
     * @return the value of contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Set the value of contrasenia
     *
     * @param contrasenia new value of contrasenia
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    private String rol;

    /**
     * Get the value of rol
     *
     * @return the value of rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * Set the value of rol
     *
     * @param rol new value of rol
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String contrasenia, String rol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

}
