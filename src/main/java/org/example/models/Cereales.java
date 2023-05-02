package org.example.models;

import org.example.interfaces.EsAlimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate caducidad;
    private int calorias;

    public Cereales(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }
    public Cereales() {
    }
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

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    @Override
    public void setFechaCaducidad(String fechaCaducidad) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.caducidad = LocalDate.parse(fechaCaducidad, formatter);
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;    }

    @Override
    public int getCalorias() {
        if(this.tipoCereal.equals("espelta")){
            return 5;
        } else if (this.tipoCereal.equals("maíz")) {
            return 8;
        } else if (this.tipoCereal.equals("trigo")) {
            return 12;
        }else{
            return 15;
        }
    }
    @Override
    public String toString() {
        return "Cereales{" + "marca=" + marca + ", precio=" + precio + ", tipoCereal=" + tipoCereal + getCaducidad() + getCalorias() + '}';
    }
}
