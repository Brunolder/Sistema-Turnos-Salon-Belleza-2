package ar.edu.unahur.obj2.peluqueria.servicios;

public class ServCorteDeCabello implements IServicios {
    
    private static int contador = 0;
    
    @Override
    public String emitirComprobante() {
        contador++;
        return "TRN-COR-" + contador;
    }

}
