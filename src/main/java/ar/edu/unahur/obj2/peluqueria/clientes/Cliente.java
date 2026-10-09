package ar.edu.unahur.obj2.peluqueria.clientes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.peluqueria.excepciones.CategoriaNoAutorizadaException;
import ar.edu.unahur.obj2.peluqueria.excepciones.ClienteSinTurnosException;
import ar.edu.unahur.obj2.peluqueria.turnos.Turnos;

public class Cliente {
    private String nombre;
    private ICategoria categoria;
    private final List<Turnos> historial;

    public Cliente(String nombre, ICategoria categoria, List<Turnos> historial) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.historial = new ArrayList<>(historial);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ICategoria getCategoria() {
        return categoria;
    }

    public List<Turnos> getHistorial() {
        if(historial.isEmpty()) {
            throw new ClienteSinTurnosException("El cliente no tiene turnos en su historial");
        }
        return new ArrayList<>(historial);
    }

    public void cambiarCategoria(ICategoria nuevaCategoria) {

        if(nuevaCategoria instanceof VIP && historial.isEmpty()) {
            throw new CategoriaNoAutorizadaException("El cliente no tiene suficientes turnos para ser categoría VIP");
        }
        this.categoria = nuevaCategoria;
    }

    public void agregarTurno(Turnos turno) {
        historial.add(turno);
    }

    public int cantidadDeTurnos() {
        return historial.size();
    }

    public double importeTotalGastado() {
        return historial.stream().mapToDouble(Turnos::getImporteTotal).sum();
    }

    
}
