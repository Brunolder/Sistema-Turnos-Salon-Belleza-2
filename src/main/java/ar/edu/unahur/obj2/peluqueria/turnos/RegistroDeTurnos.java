package ar.edu.unahur.obj2.peluqueria.turnos;

import java.util.ArrayList;
import java.util.List;

public class RegistroDeTurnos {

    private static RegistroDeTurnos instancia = new RegistroDeTurnos();
    private List<Turnos> turnos;
    private RegistroDeTurnos() {
        this.turnos = new ArrayList<>();
    }

    public static RegistroDeTurnos getInstancia() {
        return instancia;
    }

    public void registrarTurno(Turnos turno) {
        turnos.add(turno);
    }

    public List<Turnos> getTurnos() {
        return new ArrayList<>(turnos);
    }

    public int cantidadDeTurnosConfirmados(){
        return turnos.size();
    }
    
}
