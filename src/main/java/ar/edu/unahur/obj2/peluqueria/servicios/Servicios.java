package ar.edu.unahur.obj2.peluqueria.servicios;

import ar.edu.unahur.obj2.peluqueria.excepciones.PrecioNegativoException;

public abstract class Servicios {
    private Double precioBase;
    private Integer cuposDisponibles;
    private IServicios servicio;

    public Servicios(Double precioBase, Integer cuposDisponibles, IServicios servicio) {
        if (precioBase < 0) {
            throw new PrecioNegativoException("El precio base no puede ser negativo");
        }
        this.precioBase = precioBase;
        this.cuposDisponibles = cuposDisponibles;
        this.servicio = servicio;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Integer getCuposDisponibles() {
        return cuposDisponibles;
    }

    public String emitirComprobante() {
        return servicio.emitirComprobante();
    }

    public void verificarCuposDisponibles(int cantidadDeTurnos) {
        if (cantidadDeTurnos > cuposDisponibles) {
            throw new IllegalStateException("No hay suficientes cupos disponibles");
        }
    }

    public void confirmarTurno(int cantidadDeTurnos) {
        verificarCuposDisponibles(cantidadDeTurnos);
        cuposDisponibles -= cantidadDeTurnos;
    }

    
}
