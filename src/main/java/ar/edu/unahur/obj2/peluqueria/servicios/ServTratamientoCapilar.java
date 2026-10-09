package ar.edu.unahur.obj2.peluqueria.servicios;

public class ServTratamientoCapilar implements IServicios {
    
    private static int contador = 0;
    
    @Override
    public String emitirComprobante() {
        contador++;
        return "TRN-TRA-" + contador;
    }

}
