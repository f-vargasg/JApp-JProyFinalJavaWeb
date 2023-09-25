package com.fvgprinc.ctrlconsodont.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author garfi
 */


@Entity
public class Turno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurno;

    /**
     * Get the value of idTurno
     *
     * @return the value of idTurno
     */
    public int getIdTurno() {
        return idTurno;
    }

    /**
     * Set the value of idTurno
     *
     * @param idTurno new value of idTurno
     */
    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;

    /**
     * Get the value of fechaTurno
     *
     * @return the value of fechaTurno
     */
    public Date getFechaTurno() {
        return fechaTurno;
    }

    /**
     * Set the value of fechaTurno
     *
     * @param fechaTurno new value of fechaTurno
     */
    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    private String horaTurno;

    /**
     * Get the value of horaTurno
     *
     * @return the value of horaTurno
     */
    public String getHoraTurno() {
        return horaTurno;
    }

    /**
     * Set the value of horaTurno
     *
     * @param horaTurno new value of horaTurno
     */
    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }

    private String afeccion;

    /**
     * Get the value of afeccion
     *
     * @return the value of afeccion
     */
    public String getAfeccion() {
        return afeccion;
    }

    /**
     * Set the value of afeccion
     *
     * @param afeccion new value of afeccion
     */
    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }
    
    @ManyToOne
    @JoinColumn(name="id_odonto")
    private Odontologo odonto;
    
    
    @ManyToOne
    @JoinColumn(name="id_pacien")
    private Paciente pacien;

    public Turno() {
    }

    public Turno(int idTurno, Date fechaTurno, String horaTurno, String afeccion) {
        this.idTurno = idTurno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.afeccion = afeccion;
    }

}
