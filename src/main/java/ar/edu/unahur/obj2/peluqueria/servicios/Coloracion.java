package ar.edu.unahur.obj2.peluqueria.servicios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.peluqueria.turnos.AvisoDeRetoque;

public class Coloracion extends Servicios {

    private List<AvisoDeRetoque> avisosDeRetoque;

    public Coloracion(double precio, int cupos){
        super(precio, cupos, new ServColoracion());
        avisosDeRetoque = new ArrayList<AvisoDeRetoque>();
    }

    public void agregarAvisoDeRetoque(AvisoDeRetoque aviso){
        avisosDeRetoque.add(aviso);
    }
}
