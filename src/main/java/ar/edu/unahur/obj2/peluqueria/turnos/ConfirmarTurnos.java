package ar.edu.unahur.obj2.peluqueria.turnos;
import ar.edu.unahur.obj2.peluqueria.clientes.Cliente;
import ar.edu.unahur.obj2.peluqueria.servicios.Servicios;

public abstract class ConfirmarTurnos {
    public final Turnos confirmar(Cliente cliente, Servicios servicio, Integer cantidadDeTurnos){
        validarDatos(cliente, servicio);
        validarCantidadDeTurnos(cantidadDeTurnos);
        servicio.verificarCuposDisponibles(cantidadDeTurnos);
        Double subtotal = servicio.getPrecioBase() * cantidadDeTurnos;
        Double descuento = cliente.getCategoria().calcularDescuento();
        Double total = subtotal - (subtotal * descuento);
        String comprobante = servicio.emitirComprobante();
        Turnos turno = new Turnos(cliente, servicio, cantidadDeTurnos, total, comprobante, comprobante);
        servicio.confirmarTurno(cantidadDeTurnos);
        cliente.agregarTurno(turno);
        RegistroDeTurnos.getInstancia().registrarTurno(turno);
        return turno;

    }

    private void validarDatos(Cliente cliente, Servicios servicio) {
        if (cliente == null || servicio == null) {
            throw new IllegalArgumentException("El cliente y el servicio no pueden ser nulos");
        }
    }

    private void validarCantidadDeTurnos(Integer cantidadDeTurnos) {
        if (cantidadDeTurnos == null || cantidadDeTurnos <= 0) {
            throw new IllegalArgumentException("La cantidad de turnos debe ser mayor a cero");
        }
    }
}
