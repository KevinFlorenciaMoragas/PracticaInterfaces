package org.example.models;

import org.example.interfaces.ConDescuento;
import org.example.interfaces.EsAlimento;
import org.example.interfaces.EsLiquido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vino implements EsLiquido, ConDescuento, EsAlimento {

    private String marca;
    private double precio;
    private double tipoVino;
    private double gradoAlcohol;
    private double descuento;
    private double volume;
    private String tipoEnvase;
    private LocalDate caducidad;
    private int calorias;



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

    public double getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(double tipoVino) {
        this.tipoVino = tipoVino;
    }

    public double getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(double gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public Vino(String marca, double precio, double tipoVino, double gradoAlcohol) {
        this.marca = marca;
        this.precio = precio;
        this.tipoVino = tipoVino;
        this.gradoAlcohol = gradoAlcohol;
    }
    public Vino() {
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
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoEnvase;
    }

    @Override
    public void setFechaCaducidad(String fechaCaducidad) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.caducidad = LocalDate.parse(fechaCaducidad, formatter);
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        return this.calorias;
    }

}
