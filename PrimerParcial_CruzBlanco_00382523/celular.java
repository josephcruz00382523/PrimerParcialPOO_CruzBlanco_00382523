public class celular extends Electronicos implements Precio{

    private int cantidadEnInvetario;
    private int cantidadPorVender;

    public int getCantidadEnInvetario() {
        return cantidadEnInvetario;
    }

    public void setCantidadEnInvetario(int cantidadEnInvetario) {
        this.cantidadEnInvetario = cantidadEnInvetario;
    }

    @Override
    public boolean precio() {
        double total = 0;

        if (cantidadEnInvetario - cantidadPorVender> 0){

            total =    cantidadPorVender*precio;

            System.out.println("El total es : $"+total);

            return true;
        }else {
            System.out.println("No hay suficientes en inventario para proceder con la venta");
            return false;
    }

    }

    @Override
    public void MostrarDescripcion() {
        System.out.print(descripcion);
    }
}

