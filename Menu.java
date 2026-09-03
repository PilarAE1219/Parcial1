import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        System.out.println("Por favor ingrese el tamaño de la matriz de productos: ");
        int n = sc.nextInt();
        //n = sc.nextInt();
        ObjAlmacen[][] productos = new ObjAlmacen[n][n];
        Boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese la opción que desea realizar: ");
            System.out.println("1. Registrar productos");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Mostrar productos con descuento");
            System.out.println("4. Mostrar productos sin descuento");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    productos = m.RegistrarProductos(productos, sc);
                    break;
                case 2:
                    m.MostrarProductos(productos);
                    break;
                case 3:
                    m.MostrarProductosConDescuento(productos);
                    break;
                case 4:
                    m.MostrarProductosSinDescuento(productos);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
                    break;
            }
        }
    }
     
}