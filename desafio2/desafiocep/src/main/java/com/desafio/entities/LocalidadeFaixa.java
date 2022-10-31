package com.desafio.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LocalidadeFaixa
 */

@Entity
@Table(name = "localicade_faixa")
public class LocalidadeFaixa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locNu;
    private String locCepIni;
    private String locCepFim;
    private String locTipoCep;

    public LocalidadeFaixa() {
    }

    public LocalidadeFaixa(Integer locNu, String locCepIni, String locCepFim, String locTipoCep) {
        this.locNu = locNu;
        this.locCepIni = locCepIni;
        this.locCepFim = locCepFim;
        this.locTipoCep = locTipoCep;
    }

    public Integer getLocNu() {
        return locNu;
    }

    public void setLocNu(Integer locNu) {
        this.locNu = locNu;
    }

    public String getLocCepIni() {
        return locCepIni;
    }

    public void setLocCepIni(String locCepIni) {
        this.locCepIni = locCepIni;
    }

    public String getLocCepFim() {
        return locCepFim;
    }

    public void setLocCepFim(String locCepFim) {
        this.locCepFim = locCepFim;
    }

    public String getLocTipoCep() {
        return locTipoCep;
    }

    public void setLocTipoCep(String locTipoCep) {
        this.locTipoCep = locTipoCep;
    }

    @Override
    public String toString() {
        return "LocalidadeFaixa [locNu=" + locNu + ", locCepIni=" + locCepIni + ", locCepFim=" + locCepFim
                + ", locTipoCep=" + locTipoCep + "]";
    }

}