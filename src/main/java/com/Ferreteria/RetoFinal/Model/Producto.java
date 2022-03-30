package com.Ferreteria.RetoFinal.Model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Producto {


    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private String nombre;
    private Double precio;
    private String idProveedor;

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", idProveedor='" + idProveedor + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }
}
