import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static List<Electronicos> dispositivos;
    public static void main(String[] args) {

        dispositivos = new ArrayList<>();
        int opcion = 0;
        String item;
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("Sistema de inventario");
        System.out.println("1. Agregar a inventario");
        System.out.println("2.Modificar inventario");
        System.out.println("3. Ver listado");
        System.out.println("4. salir");


        do {
            System.out.println("---------------------");
            System.out.println("Sistema de inventario");
            System.out.println("1. Agregar a inventario");
            System.out.println("2.Modificar inventario");
            System.out.println("3. Ver listado");
            System.out.println("4. salir");

            switch (opcion){
                case 1:
                    System.out.println(" ");
                    System.out.println("agregar computador o telefono ('C' , 'T') ");
                    item = scanner.next();
                    if (Objects.equals(item, "C")){
                        computadora Compu = new computadora();
                        System.out.println("Nombre de item :");
                        Compu.setNombre(scanner.nextLine());
                        System.out.println("Modelo de item :");
                        Compu.setModelo(scanner.nextLine());
                        System.out.println("descripcion de item :");
                        Compu.setModelo(scanner.next());
                        System.out.println("Precio de item : ");
                        Compu.setPrecio(scanner.nextDouble());
                        System.out.println("cantidad en inventario: ");
                        Compu.setCantidadEnInventario(scanner.nextInt());

                        if (dispositivos.isEmpty()){

                            dispositivos.add(Compu);

                        }else {
                            Compu.setID(dispositivos.size()+1);
                            dispositivos.add(Compu);
                        }
                    }else   if (Objects.equals(item, "T")){

                        celular Celular = new celular();
                        System.out.println("Nombre de item :");
                        Celular.setNombre(scanner.nextLine());
                        System.out.println("Modelo de item :");
                        Celular.setModelo(scanner.nextLine());
                        System.out.println("descripcion de item :");
                        Celular.setModelo(scanner.next());
                        System.out.println("Precio de item : ");
                        Celular.setPrecio(scanner.nextDouble());
                        System.out.println("cantidad en inventario: ");
                        Celular.setCantidadEnInvetario(scanner.nextInt());

                        if (dispositivos.isEmpty()){

                            dispositivos.add(Celular);

                        }else {
                            Celular.setID(dispositivos.size()+1);
                            dispositivos.add(Celular);
                    }
                    break;
                case 2:
                    System.out.println("ingrese el id de el item a modifcar : ");

                    break;
                case 3:

                    break;

            }
        }while (opcion !=4);

    }
}