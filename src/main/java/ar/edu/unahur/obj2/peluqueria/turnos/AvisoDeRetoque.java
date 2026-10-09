package ar.edu.unahur.obj2.peluqueria.turnos;
import ar.edu.unahur.obj2.peluqueria.clientes.Cliente;

public class AvisoDeRetoque {
    Cliente cliente;
    Turnos turno;
    String fechaDeRetoque;

    public AvisoDeRetoque(Cliente cliente, Turnos turno, String fechaDeRetoque) {
        this.cliente = cliente;
        this.turno = turno;
        this.fechaDeRetoque = fechaDeRetoque;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Turnos getTurno() {
        return turno;
    }

    public String getFechaDeRetoque() {
        return fechaDeRetoque;
    }
}
