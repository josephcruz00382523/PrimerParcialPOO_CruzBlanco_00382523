public class computadora extends Electronicos  implements Precio{

    private int cantidadEnInventario;
    private int cantidadPorVender;

    public computadora() {
    }

    public computadora(int cantidadEninventario, int cantidadPorVender) {
        this.cantidadEnInventario = cantidadEninventario;
        this.cantidadPorVender = cantidadPorVender;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }

    @Override
    public boolean precio() {
        double total=0;
        if (cantidadEnInventario - cantidadPorVender> 0){

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
