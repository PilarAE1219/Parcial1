import java.util.Scanner;

public class Metodos {
    public ObjAlmacen[][] RegistrarProductos(ObjAlmacen[][] a, Scanner sc){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.next();
                System.out.println("Ingrese el precio del producto: ");

                Double precio = 0.0;
                Boolean validarPrecio = true;
                while(validarPrecio){
                    if(sc.hasNextDouble()){
                        precio = sc.nextDouble();
                        validarPrecio = false;
                    }else{
                        System.out.println("El valor ingresado no es un número válido. Por favor, ingrese un número.");
                        sc.next(); 
                    }
                }

                System.out.println("Ingrese el descuento del producto en números: ");
                Double descuento = 0.0;
                Boolean validarDescuento = true;
                while(validarDescuento){
                    if(sc.hasNextDouble()){
                        descuento = sc.nextDouble();
                        validarDescuento = false;
                    }else{
                        System.out.println("El valor ingresado no es un número válido. Por favor, ingrese un número.");
                        sc.next(); 
                    }
                }
                a[i][j] = new ObjAlmacen(nombre, precio, descuento);
            }
        }
        return a;

    }

    public void MostrarProductos(ObjAlmacen[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.println("Nombre del producto: " + a[i][j].getNombre());
                System.out.println("Precio del producto: " + a[i][j].getPrecio());
                System.out.println("Descuento del producto (en números): " + a[i][j].getDescuento());
                System.out.println("----------------------------------------------------------------------");
            }
        }
    }

    public void MostrarProductosConDescuento(ObjAlmacen[][] a){
        int contadorProductosConDescuento = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j].getDescuento() > 0){
                    
                    System.out.println("Nombre del producto: " + a[i][j].getNombre());
                    System.out.println("Precio del producto: " + a[i][j].getPrecio());
                    System.out.println("Descuento del producto (en números): " + a[i][j].getDescuento() + " %");
                    System.out.println("Precio final del producto (con el descuento): " + (a[i][j].getPrecio() - (a[i][j].getDescuento() / 100 * a[i][j].getPrecio())));
                    System.out.println("----------------------------------------------------------------------");
                    
                    contadorProductosConDescuento++;
                }
            }
        }
        System.out.println("Cantidad de productos con descuento: " + contadorProductosConDescuento);
        System.out.println("----------------------------------------------------------------------");
    }

    public void MostrarProductosSinDescuento(ObjAlmacen[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j].getDescuento() == 0){
                    System.out.println("Nombre del producto: " + a[i][j].getNombre());
                    System.out.println("Precio del producto: " + a[i][j].getPrecio());
                    System.out.println("Precio final del producto (sin el descuento): " + a[i][j].getPrecio());
                    System.out.println("----------------------------------------------------------------------");
                }
            }
        }
    }

    

}