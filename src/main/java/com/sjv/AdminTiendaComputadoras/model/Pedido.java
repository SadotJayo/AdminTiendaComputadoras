package com.sjv.AdminTiendaComputadoras.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
    @Id
    @Column(name = "id_pedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    @Column(name = "nombre_cliente", length = 100)
    private String nombreCliente;

    @Column(name = "apellidos_cliente", length = 100)
    private String apellidosCliente;

    @Column(name = "correo", length = 100)
    private String correo;

    @Column(name = "celular", length = 100)
    private String celular;

    @Column(name = "direccion", length = 100)
    private String direccion;

    @Column(name = "referencia", length = 100)
    private String referencia;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_distrito")
    Distrito distrito;

    @Column(name = "fecha_pedido")
    private String fechaPedido;

    public Pedido() {
    }

    public Pedido(int idPedido, String nombreCliente, String apellidosCliente, String correo, String celular, String direccion, String referencia, Distrito distrito, String fechaPedido) {
        this.idPedido = idPedido;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.correo = correo;
        this.celular = celular;
        this.direccion = direccion;
        this.referencia = referencia;
        this.distrito = distrito;
        this.fechaPedido = fechaPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
}
