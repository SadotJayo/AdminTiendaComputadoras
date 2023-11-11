package com.sjv.AdminTiendaComputadoras.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_distrito")
public class Distrito {
    @Id
    @Column(name = "id_distrito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrito;
    @Column(name = "distrito", length = 100)
    private String distrito;

    public Distrito() {
    }

    public Distrito(int idDistrito, String distrito) {
        this.idDistrito = idDistrito;
        this.distrito = distrito;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
