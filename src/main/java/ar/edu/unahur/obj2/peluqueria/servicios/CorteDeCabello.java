package ar.edu.unahur.obj2.peluqueria.servicios;

public class CorteDeCabello extends Servicios {

    public CorteDeCabello(double precio, int cupos){
        super(precio, cupos, new ServCorteDeCabello());
    }

}
