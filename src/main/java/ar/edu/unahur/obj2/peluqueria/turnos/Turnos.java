package ar.edu.unahur.obj2.peluqueria.turnos;

import ar.edu.unahur.obj2.peluqueria.clientes.Cliente;
import ar.edu.unahur.obj2.peluqueria.servicios.Servicios;

public class Turnos {
    private Cliente cliente;
    private Servicios servicio;
    private Integer cantidadDeTurnos;
    private Double importeTotal;
    private String comprobante;
    private String fecha;
    
    public Turnos(Cliente cliente, Servicios servicio, Integer cantidadDeTurnos, Double importeTotal,
            String comprobante, String fecha) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.cantidadDeTurnos = cantidadDeTurnos;
        this.importeTotal = importeTotal;
        this.comprobante = comprobante;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servicios getServicio() {
        return servicio;
    }

    public Integer getCantidadDeTurnos() {
        return cantidadDeTurnos;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public String getComprobante() {
        return comprobante;
    }

    public String getFecha() {
        return fecha;
    }

    
}
