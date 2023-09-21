package com.fvgprinc.ctrlconsodont.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author garfi
 */

@Entity
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHorario;

    /**
     * Get the value of idHorario
     *
     * @return the value of idHorario
     */
    public int getIdHorario() {
        return idHorario;
    }

    /**
     * Set the value of idHorario
     *
     * @param idHorario new value of idHorario
     */
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    private String horarioInicio;

    /**
     * Get the value of horarioInicio
     *
     * @return the value of horarioInicio
     */
    public String getHorarioInicio() {
        return horarioInicio;
    }

    /**
     * Set the value of horarioInicio
     *
     * @param horarioInicio new value of horarioInicio
     */
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    private String horarioFin;

    /**
     * Get the value of horarioFin
     *
     * @return the value of horarioFin
     */
    public String getHorarioFin() {
        return horarioFin;
    }

    /**
     * Set the value of horarioFin
     *
     * @param horarioFin new value of horarioFin
     */
    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }

    public Horario() {
    }

    public Horario(int idHorario, String horarioInicio, String horarioFin) {
        this.idHorario = idHorario;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
    }

}
