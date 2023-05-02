package org.example.interfaces;

import java.time.LocalDate;

public interface EsAlimento {
    public void setFechaCaducidad(String fechaCaducidad);
    public LocalDate getCaducidad();
    public int getCalorias();

}
