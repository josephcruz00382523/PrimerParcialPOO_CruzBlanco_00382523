public class computadora extends Electronicos {

    private int cantidadEninventario;
    private int cantidadPorVender;


    public boolean Precio(){
       double total = 0;

        if (cantidadEninventario - cantidadPorVender> 0){

         total =    cantidadPorVender*precio;

            System.out.println("El total es : $");

         return true;
        }else {
            System.out.println("No hay suficientes en inventario para proceder con la venta");
            return false;
        }
    }

    public void mostrarDescripcion(){
        System.out.print(descripcion);
    }
}
