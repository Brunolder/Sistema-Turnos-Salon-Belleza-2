package ar.edu.unahur.obj2.peluqueria;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.peluqueria.clientes.Cliente;
import ar.edu.unahur.obj2.peluqueria.servicios.CorteDeCabello;
import ar.edu.unahur.obj2.peluqueria.servicios.TratamientoCapilar;
import ar.edu.unahur.obj2.peluqueria.turnos.ConfirmarTurnos;
import ar.edu.unahur.obj2.peluqueria.turnos.Turnos;

public class SalonTest {

    @Test 
    public void Confirmar_Turnos_Y_Registrar_Comprobantes() {
        Cliente cliente = new Cliente("Juan", "Frecuente", "");
        CorteDeCabello corte = new CorteDeCabello(100.0, 5);
        Turnos turnos = new Turnos(cliente, corte, null, null, null, null);
    }

    public void Confirmar_Turnos_Y_Registrar_Comprobantes_Con_Servicio_Tratamiento_Capilar() {
        Cliente cliente = new Cliente("Juan", "Ocacional", "");
        TratamientoCapilar corte = new TratamientoCapilar(100.0, 5);
        Turnos turnos = new Turnos(cliente, corte, null, null, null, null);
}
