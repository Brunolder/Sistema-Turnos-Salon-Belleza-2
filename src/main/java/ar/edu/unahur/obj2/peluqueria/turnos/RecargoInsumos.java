package ar.edu.unahur.obj2.peluqueria.turnos;

import ar.edu.unahur.obj2.peluqueria.excepciones.PrecioNegativoException;

public class RecargoInsumos {
    private Double importeRecargo;

    public RecargoInsumos(Double importeRecargo) {
        if(importeRecargo < 0) {
            throw new PrecioNegativoException("El importe del recargo no puede ser negativo");
        }
        this.importeRecargo = importeRecargo;
    }

    public Double getImporteRecargo() {
        return importeRecargo;
    }
}
