package org.example;

import org.example.models.Cereales;
import org.example.models.Detergente;
import org.example.models.Vino;

public class Main {
    public static void main(String[] args) {
        Cereales c = new Cereales("Kellogs", 2.5, "espelta");
        Detergente d = new Detergente("Ariel", 3.5);
        Vino v  = new Vino("Don Simon", 5.5, 1.5, 12.5);
        System.out.println("Detergente");
        System.out.println(d.toString());
        System.out.println(d.getPrecio());
        d.setDescuento(0.5);
        System.out.println(d.getDescuento());
        System.out.println(d.getPrecioDescuento());
        System.out.println("Cereales");
        System.out.println(c.toString());
        System.out.println(c.getCalorias());
        System.out.println(c.getCaducidad());
        System.out.println("Vino");
        System.out.println(v.toString());
        v.setFechaCaducidad("12/12/2021");
        System.out.println(v.getCaducidad());
        v.setDescuento(0.5);
        System.out.println(v.getDescuento());
        System.out.println(v.getPrecioDescuento());



    }
}