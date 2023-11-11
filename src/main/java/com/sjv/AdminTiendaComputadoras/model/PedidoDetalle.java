package com.sjv.AdminTiendaComputadoras.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pedido_detalle")
public class PedidoDetalle {
    @Id
    @Column(name = "id_pedido_detalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedidoDetalle;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido")
    Pedido pedido;

    @Column(name = "cantidad")
    private int cantidad;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    Producto producto;

    @Column(name = "precio_unitario")
    private double precioUnitario;

    public PedidoDetalle() {
    }

    public PedidoDetalle(int idPedidoDetalle, Pedido pedido, int cantidad, Producto producto, double precioUnitario) {
        this.idPedidoDetalle = idPedidoDetalle;
        this.pedido = pedido;
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
    }

    public int getIdPedidoDetalle() {
        return idPedidoDetalle;
    }

    public void setIdPedidoDetalle(int idPedidoDetalle) {
        this.idPedidoDetalle = idPedidoDetalle;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
