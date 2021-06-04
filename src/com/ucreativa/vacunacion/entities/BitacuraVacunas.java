package com.ucreativa.vacunacion.entities;

import java.util.Date;

public class BitacuraVacunas {
    private Persona persona;
    private String sintomas;
    private String marca;
    private int dosis;
    private Date fecha;

    public BitacuraVacunas(Persona persona, String sintomas, String marca, int dosis, Date fecha) {
        this.persona = persona;
        this.sintomas = sintomas;
        this.marca = marca;
        this.dosis = dosis;
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getMarca() {
        return marca;
    }

    public int getDosis() {
        return dosis;
    }

    public Date getFecha() {
        return fecha;
    }
}
