package org.example.models;

import org.example.interfaces.ConDescuento;
import org.example.interfaces.EsLiquido;

public class Detergente implements ConDescuento {
    private String marca;
    private double precio;
    private double descuento;
    private double precioDescuento;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }
    public Detergente() {
    }
    @Override
    public void setDescuento(double descuento) {
    this.descuento = descuento;
    }

    @Override
    public double getDescuento() {
        return this.descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return this.precio - this.getDescuento();
    }
    @Override
    public String toString() {
        return "Detergente{" + "marca=" + marca + ", precio=" + precio + '}';
    }
}
