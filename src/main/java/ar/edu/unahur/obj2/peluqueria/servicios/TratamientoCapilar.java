package ar.edu.unahur.obj2.peluqueria.servicios;

public class TratamientoCapilar extends Servicios {

    public TratamientoCapilar(double precio, int cupos){
        super(precio, cupos, new ServTratamientoCapilar());
    }

}
