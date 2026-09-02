public class ObjAlmacen {
    private String Nombre;
    private Double Precio;
    private Double Descuento;

    public ObjAlmacen(){

    }

    public ObjAlmacen(String nombre, Double precio, Double descuento) {
        Nombre = nombre;
        Precio = precio;
        Descuento = descuento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public Double getDescuento() {
        return Descuento;
    }

    public void setDescuento(Double descuento) {
        Descuento = descuento;
    }

}