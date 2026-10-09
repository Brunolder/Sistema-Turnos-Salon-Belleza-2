package ar.edu.unahur.obj2.peluqueria.clientes;

public class VIP implements ICategoria {
    
    @Override
    public Double calcularDescuento() {
        return 0.20;
    }

}
